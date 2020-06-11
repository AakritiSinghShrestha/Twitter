package com.example.twitterRest.Repository;

import com.example.twitterRest.model.Tweet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TweetRepository extends CrudRepository<Tweet,Long> {
    List<Tweet> findAll();
}
