package com.PaDa.repository;

import com.PaDa.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(Long id);
    public void saveOrUpdate (Student student);
    public void deleteById(Long id);
}
