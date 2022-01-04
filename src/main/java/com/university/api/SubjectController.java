package com.university.api;

import com.university.entity.Subject;
import com.university.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping("/")
    public String index(){
        return "Начало работы с предметами";
    }

    @GetMapping("/getSubjects")
    public List<Subject> getAll(){
        return subjectService.getAll();
    }

    @PostMapping("addSubject")
    public void addStudent(@RequestBody Subject subject){
        subjectService.createSubject(subject);
    }
}