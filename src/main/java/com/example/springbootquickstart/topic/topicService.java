package com.example.springbootquickstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<topic> topics = new ArrayList<>( Arrays.asList(
            new topic("1", "java", "learn java"),
            new topic("2", "dsa", "learn algorithm"),
            new topic("3", "op", "object oriented programming")
    ));

    public List<topic> getAllTopics(){
        List<topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public topic getTopic(String id){
        return topicRepository.findById(id).get();
    }


    public void addTopic(topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
