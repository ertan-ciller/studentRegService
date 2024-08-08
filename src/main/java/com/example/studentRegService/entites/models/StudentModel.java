package com.example.studentRegService.entites.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentModel {

    private String name;
    private String lastName;
    private String faculty;
    private String department;
    private boolean isPlayBefore;
    private int phoneNumber;
}
