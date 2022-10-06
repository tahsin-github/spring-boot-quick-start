package com.example.springbootquickstart.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<course, String> {

    public List<course> findByTopicId(String topicId);

}
