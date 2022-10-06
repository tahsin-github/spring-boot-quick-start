package com.example.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<topic, String> {
    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic topic)
    // deleteTopic(String id)
}
