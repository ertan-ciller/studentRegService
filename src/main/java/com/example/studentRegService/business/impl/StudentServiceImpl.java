package com.example.studentRegService.business.impl;

import com.example.studentRegService.business.StudentService;
import com.example.studentRegService.business.requests.CreateStudentRequest;
import com.example.studentRegService.business.requests.UpdateStudentRequest;
import com.example.studentRegService.business.responses.GetByIdStudentResponse;
import com.example.studentRegService.dataAccess.StudentRepository;
import com.example.studentRegService.entites.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();

    }
    @Override
    public void add(CreateStudentRequest createStudentRequest) {

    }

    @Override
    public void update(UpdateStudentRequest updateStudentRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public String createHealthCheck() {
        return null;
    }

    @Override
    public GetByIdStudentResponse getById(int id) {
        return null;
    }


}
