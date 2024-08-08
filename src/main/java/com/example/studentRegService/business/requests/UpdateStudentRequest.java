package com.example.studentRegService.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStudentRequest {

    private int id;
    private String name;
    private String lastName;
    private String faculty;
    private String department;
    private boolean isPlayBefore;
    private int phoneNumber;
}
