package com.best.project.entity;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tweets")
public class Tweet {


    private int tweet_id;
    @Indexed(name = "author_id")
    private String author_id;
    private boolean inbound;
    private String created_at;
    private String text;
    private String response_tweet_id;
    private int in_response_to_tweet_id;

    public int getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(int tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public boolean isInbound() {
        return inbound;
    }

    public void setInbound(boolean inbound) {
        this.inbound = inbound;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponse_tweet_id() {
        return response_tweet_id;
    }

    public void setResponse_tweet_id(String response_tweet_id) {
        this.response_tweet_id = response_tweet_id;
    }

    public int getIn_response_to_tweet_id() {
        return in_response_to_tweet_id;
    }

    public void setIn_response_to_tweet_id(int in_response_to_tweet_id) {
        this.in_response_to_tweet_id = in_response_to_tweet_id;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweet_id=" + tweet_id +
                ", author_id=" + author_id +
                ", inbound=" + inbound +
                ", created_at='" + created_at + '\'' +
                ", text='" + text + '\'' +
                ", response_tweet_id='" + response_tweet_id + '\'' +
                ", in_response_to_tweet_id=" + in_response_to_tweet_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return tweet_id == tweet.tweet_id && author_id == tweet.author_id && inbound == tweet.inbound && in_response_to_tweet_id == tweet.in_response_to_tweet_id && Objects.equals(created_at, tweet.created_at) && Objects.equals(text, tweet.text) && Objects.equals(response_tweet_id, tweet.response_tweet_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tweet_id, author_id, inbound, created_at, text, response_tweet_id, in_response_to_tweet_id);
    }
}
