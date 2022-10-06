package com.example.springbootquickstart.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class courseService {

    @Autowired
    private CourseRepository courseRepository;

//    private List<course> courses = new ArrayList<>( Arrays.asList(
//            new course("1", "java", "learn java"),
//            new course("2", "dsa", "learn algorithm"),
//            new course("3", "op", "object oriented programming")
//    ));

    public List<course> getAllCourses(String topicId){
        List<course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public course getCourse(String id){
        return courseRepository.findById(id).get();
    }


    public void addCourse(course course) {
        courseRepository.save(course);
    }

    public void updateCourse(course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
