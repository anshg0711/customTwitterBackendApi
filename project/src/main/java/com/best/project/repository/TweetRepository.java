package com.best.project.repository;

import com.best.project.entity.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TweetRepository extends MongoRepository<Tweet, Integer> {

    @Query(value = "{'author_id': ?0}, 'title': ?1")
    List<Tweet> findByAuthorId(String author_id);


    @Query(value = "{'author_id' : ?0}", delete = true)
    void deleteTweetByAuthorId(String author_id);


    @Query("{'text': { $regex: ?0 }}")
    List<Tweet> findByTweetContainingKeyword(String word);

}
