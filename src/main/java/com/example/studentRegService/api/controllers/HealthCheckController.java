package com.example.studentRegService.api.controllers;

import com.example.studentRegService.api.constants.ApiEndpoints;
import com.example.studentRegService.business.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiEndpoints.HEALTHCHECK_API)
public class HealthCheckController {

    @Autowired
    StudentService studentService;

    public ResponseEntity<String> createHealthCheck(){

        return new ResponseEntity<>(studentService.createHealthCheck(), HttpStatus.OK);

    }

}
