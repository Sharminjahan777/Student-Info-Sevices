package com.aineurontech.StudentInfoServices.repository;

import com.aineurontech.StudentInfoServices.entity.Student;

import org.springframework.data.repository.CrudRepository;
public interface StudentRepository extends CrudRepository<Student, Long>{
}
