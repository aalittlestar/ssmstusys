package com.wuyr.service;

import com.wuyr.pojo.Student;

import java.util.List;

public interface StudentService {

    int insertStudent(Student student);

    int deleteStudent(int studentId);

    int updateStudent(Student student);

    List<Student> searchFromStudent(String s);

    Student selectStudentById(int studentId);

    List<Student> selectAllStudents();

}
