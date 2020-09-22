package com.aineurontech.StudentInfoServices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aineurontech.StudentInfoServices.repository.StudentRepository;
import com.aineurontech.StudentInfoServices.entity.Student;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public List<Student> retrieveStudent(){
        List<Student> listOfStudent = (List<Student>)studentRepository.findAll();

        return listOfStudent;

    }
}
