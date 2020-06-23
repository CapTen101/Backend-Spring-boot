package com.example.demodb.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> func() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public String addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        return "added successfully";
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/topics/{id}")
    public String deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
        return "deleted successfully";
    }
}
