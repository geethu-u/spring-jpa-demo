package org.geethu.spring_jpa_demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Marks this as a service, like a service. You can use in multiple classes

@Service
public class TopicService {
    @Autowired
    private TopicRepo topicRepo;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id){
        return topicRepo.findById(id).get();
    }
    public void addTopic(Topic topic){
        topicRepo.save(topic);
    }
    public void updateTopic(String id, Topic topic){
        topicRepo.save(topic);
    }
    public void deleteTopic(String id){
        topicRepo.deleteById(id);
    }
}
