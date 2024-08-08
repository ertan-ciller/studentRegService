package com.example.studentRegService.business;

import com.example.studentRegService.business.requests.CreateStudentRequest;
import com.example.studentRegService.business.requests.UpdateStudentRequest;
import com.example.studentRegService.business.responses.GetByIdStudentResponse;
import com.example.studentRegService.entites.Student;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudent();
    void add(CreateStudentRequest createStudentRequest);
    void update(UpdateStudentRequest updateStudentRequest);
    void delete(int id);

    String createHealthCheck();


    GetByIdStudentResponse getById(int id);

}
