package com.university.api;

import com.university.entity.Student;
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

    @PostMapping("/addSubject")
    public void addStudent(@RequestBody Subject subject){
        subjectService.createSubject(subject);
    }

    @PatchMapping("/updateSubject")
    public Subject updateSubject(@RequestParam Long id, @RequestBody Subject subject){
        return subjectService.updateSubject(id, subject);
    }

    @DeleteMapping("/deleteSubject")
    public void deleteStudent(@RequestParam Long id){
        subjectService.deleteSubject(id);
    }

}