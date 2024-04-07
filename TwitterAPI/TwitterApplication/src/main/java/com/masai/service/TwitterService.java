package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

@Service
public class TwitterService {
	  @Autowired
	    private Twitter twitter;

	    public List<Tweet> searchTweets(String query) {
	        return twitter.searchOperations().search(query).getTweets();
	    }

	    public List<Tweet> getUserTweets(String screenName) {
	        return twitter.timelineOperations().getUserTimeline(screenName);
	    }
}
