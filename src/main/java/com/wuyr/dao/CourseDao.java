package com.wuyr.dao;

import com.wuyr.pojo.Course;
import com.wuyr.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    int insertCourse(Course course);

    int deleteCourse(int courseId);

    int updateCourse(Course course);

    List<Course> searchFromCourse(String s);

    Course selectCourseById(int courseId);

    List<Course> selectAllCourses();

}
