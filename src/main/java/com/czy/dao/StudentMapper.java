package com.czy.dao;

import com.czy.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    public List<Student> findAll();

    public void insertStudent(Student student);

}
