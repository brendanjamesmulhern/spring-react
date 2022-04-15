package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
