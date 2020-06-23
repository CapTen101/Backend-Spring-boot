package com.example.demodb.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String topicName;
    private int diff;

    public Topic(){}

    public Topic (String topicName, int diff){
        super();
        this.topicName = topicName;
        this.diff = diff;
    }

    public String getTopicName() {
        return topicName;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
