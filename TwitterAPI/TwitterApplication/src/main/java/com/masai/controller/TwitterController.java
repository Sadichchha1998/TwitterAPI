package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.service.TwitterService;

@RestController
public class TwitterController {
    @Autowired
    private TwitterService twitterService;

    @GetMapping("/search")
    public List<Tweet> searchTweets(@RequestParam String query) {
        return twitterService.searchTweets(query);
    }

    @GetMapping("/user-tweets")
    public List<Tweet> getUserTweets(@RequestParam String screenName) {
        return twitterService.getUserTweets(screenName);
    }
}