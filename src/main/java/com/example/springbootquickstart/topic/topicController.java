package com.example.springbootquickstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    @Autowired
    private topicService topicService;

    @RequestMapping("/topics")
    public List<topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("topics/{id}")
    public topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "topics/")
    public void addTopic(@RequestBody topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
    public void updateTopic(@RequestBody topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
