package com.example.springbootquickstart.courses;

import com.example.springbootquickstart.topic.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private topic topic;

    public topic getTopic() {
        return topic;
    }

    public void setTopic(topic topic) {
        this.topic = topic;
    }

    public course() {
    }

    public course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
