package com.wells.containerpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wells.containerpoc.entity.Student;
import com.wells.containerpoc.repo.StudentRepo;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class StudentCtrl {

    @Autowired
    private  StudentRepo studentRepo;


    @GetMapping("/students")
    public List<Student> getAllStudents() {
        log.info("fetching all students");
        return studentRepo.findAll();
    }

}
