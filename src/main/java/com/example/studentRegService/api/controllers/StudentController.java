package com.example.studentRegService.api.controllers;

import com.example.studentRegService.api.constants.ApiEndpoints;
import com.example.studentRegService.business.StudentService;
import com.example.studentRegService.business.requests.CreateStudentRequest;
import com.example.studentRegService.business.requests.UpdateStudentRequest;
import com.example.studentRegService.dataAccess.StudentRepository;
import com.example.studentRegService.entites.Student;
import com.example.studentRegService.payroll.StudentNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = ApiEndpoints.API_BASE_URL + "/students")
@AllArgsConstructor
public class StudentController {

    private final StudentRepository repository;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudent(){
        return repository.findAll();

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addStudent")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStudent(@RequestBody Student newStudent) {
        this.repository.save(newStudent);
    }


    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@RequestBody Student newStudent, @PathVariable int id){
        this.repository.findById(id)
                .map(student -> {
                    student.setName(newStudent.getName());
                    student.setLastName(newStudent.getLastName());
                    student.setFaculty(newStudent.getFaculty());
                    student.setDepartment(newStudent.getDepartment());
                    student.setPhoneNumber(newStudent.getPhoneNumber());
                    student.setPlayBefore(newStudent.isPlayBefore());
                    student.setWhichSquad(newStudent.getWhichSquad());
                    return repository.save(student);
                })
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return repository.save(newStudent);
                });

    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable int id){
        this.repository.deleteById(id);
    }

    @GetMapping("/getStudentById/{id}")
    Student getStudentById(@PathVariable int id){
       return repository.findById(id)
               .orElseThrow(() -> new StudentNotFoundException(id));

    }



}
