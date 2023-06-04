package com.best.project.Service;

import com.best.project.entity.Tweet;
import com.best.project.repository.TweetRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    private final TweetRepository tweetRepository;

    public TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public List<Tweet> fetchAllTweets() {
        return tweetRepository.findAll();
    }

    public void addTweet(Tweet tweet) {
        tweetRepository.save(tweet);
    }

    public List<Tweet> fetchTweetsByAuthorId(String author_id) {
        return tweetRepository.findByAuthorId(author_id);
    }

    public void deleteTweetByAuthorId(String author_id) {
        tweetRepository.deleteTweetByAuthorId(author_id);
    }

    public List<Tweet> findAllSortByTimestamp() {
        return tweetRepository.findAll(Sort.by(Sort.Direction.ASC, "created_at"));
    }

    public List<Tweet> findByTweetContainingKeyword(String word) {
        return tweetRepository.findByTweetContainingKeyword(word);
    }
}
