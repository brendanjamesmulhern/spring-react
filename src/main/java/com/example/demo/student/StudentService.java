package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        // check if email is taken
        studentRepository.save(student);
    };

    public void updateStudent(Student student) {
        studentRepository.findById(student.getId()).map(studentFromDB -> {
                studentFromDB = student;
                studentRepository.save(studentFromDB);
                return null;
        });
    };

    public void deleteStudent(Student student) {
        studentRepository.deleteById(student.getId());
    };
}
