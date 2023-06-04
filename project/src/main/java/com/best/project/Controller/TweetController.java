package com.best.project.Controller;

import com.best.project.Service.TweetService;
import com.best.project.entity.Tweet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tweet")
public class TweetController {
    public final TweetService tweetService;
    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }
    @GetMapping
    public ResponseEntity<List<Tweet>>fetchAllTweets() {
        return ResponseEntity.ok(tweetService.fetchAllTweets());
    }


    @GetMapping("/{author_id}")
    public List<Tweet> fetchTweetsByAuthorId(@PathVariable String author_id){
        return tweetService.fetchTweetsByAuthorId(author_id);
    }


    @DeleteMapping("/{author_id}")
    public void deleteTweetByAuthorId(@PathVariable String author_id){
        tweetService.deleteTweetByAuthorId(author_id);
    }


    @PostMapping
    public ResponseEntity addTweet(@RequestBody Tweet tweet)
    {
        tweetService.addTweet(tweet);
        return ResponseEntity.status(HttpStatus.CREATED).body("added successfully");
    }


    @GetMapping("/sortTweetByTimestamp")
    public List<Tweet> findAllSortByTimestamp() {
        return tweetService.findAllSortByTimestamp();
    }


    @GetMapping("/findTweetContainingKeyword/{word}")
    public List<Tweet> findByTweetContainingKeyword(@PathVariable String word){
        return tweetService.findByTweetContainingKeyword(word);
    }

}
