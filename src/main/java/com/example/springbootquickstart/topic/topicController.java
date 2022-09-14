package com.example.springbootquickstart.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    @RequestMapping("/topics")
    public List<topic> getAllTopics(){
        List<topic> topics = Arrays.asList(
                new topic("1", "java", "learn java"),
                new topic("2", "dsa", "learn algorithm"),
                new topic("3", "op", "object oriented programming")
        );
        return topics;
    }
}
