package com.security.school.service;

import com.security.school.dto.StudenInfo;
import com.security.school.entity.Student;
import com.security.school.entity.UserInfo;
import com.security.school.repository.StudentRepository;
import com.security.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private UserRepository userrepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAll(){
        List<Student> studenInfo = studentRepository.findAll();
        return studenInfo;
    }

    public Optional<Student> getById(int id){
        return studentRepository.findById(id);
    }

    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        userrepository.save(userInfo);
        return "user added to system ";
    }
}
