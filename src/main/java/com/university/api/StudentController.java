package com.university.api;

import com.university.entity.Student;
import com.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String index(){
        return "Начало работы с студентами";
    }

    @GetMapping("/getStudents")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @PatchMapping("/updateStudent")
    public Student updateStudent(@RequestParam Long id, @RequestBody Student student){
       return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam Long id){
        studentService.deleteStudent(id);
    }

}