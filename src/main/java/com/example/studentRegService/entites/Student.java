package com.example.studentRegService.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name ="lastName")
    private String lastName;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "department")
    private String department;

    @Column(name = "isPlayBefore")
    private boolean isPlayBefore;

    @Column(name = "whichSquad")
    private String whichSquad;

    @Column(name = "phoneNumber")
    private String phoneNumber;

}
