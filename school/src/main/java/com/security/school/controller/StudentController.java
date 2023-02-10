package com.security.school.controller;

import com.security.school.dto.StudenInfo;
import com.security.school.entity.Student;
import com.security.school.entity.UserInfo;
import com.security.school.repository.StudentRepository;
import com.security.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return studentService.addUser(userInfo);
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Student> allStudent(){
        return studentService.getAll();
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Optional<Student> signleStudent(@PathVariable int id){
        return studentService.getById(id);
    }
}
