package com.example.demodb.Topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TopicRepository extends CrudRepository<Topic, String> {

}
