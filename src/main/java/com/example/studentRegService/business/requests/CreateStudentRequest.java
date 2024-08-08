package com.example.studentRegService.business.requests;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentRequest {

    private String name;
    private String lastName;
    private String faculty;
    private String department;
    private boolean isPlayBefore;
    private int phoneNumber;
}
