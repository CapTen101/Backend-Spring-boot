package com.example.demodb.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(new Topic("energy", 9),
            new Topic("chemtech", 9),
            new Topic("Mass Transfer", 9),
            new Topic("ReactionEngg", 8),
            new Topic("CBMequipment", 7),
            new Topic("VCN", 7)
    ));


    public List<Topic> getAllTopics() {
        return topicList;
    }

    public Topic getTopic(String id) {
        Topic returnedTopic = null;
        for (Topic t : topicList) {
            if (t.getTopicName().equals(id))
                returnedTopic = t;
        }
        return returnedTopic;
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        Topic returnedTopic = null;
        for (Topic t : topicList) {
            if (t.getTopicName() == topic.getTopicName())
                returnedTopic = t;
        }

        assert returnedTopic != null;
        returnedTopic.setTopicName(id);
    }

    public void deleteTopic(String id) {
        topicList.removeIf(t -> t.getTopicName().equals(id));
    }
}
