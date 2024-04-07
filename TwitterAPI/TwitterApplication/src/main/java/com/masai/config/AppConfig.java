package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
public class AppConfig {
	 private final String apiKey = "kt5BEjVfI7CD2ANg4uKc6zKuf";
	    private final String apiSecret = "crDlyxeXblLERuHPKdefCf7qZpqMi1elz4WEgUDAbKqYCsqppm";
	    private final String accessToken = "1776847008696852480-1DfGoDKc3NpJWHnlY2w0RhhzfaB4xA";
	    private final String accessTokenSecret = "lEbOq07VrD2fmkkZS7YYXhHWFoJqIqwoJDIykPVV6vMO3";

	    @Bean
	    public TwitterTemplate twitterTemplate() {
	        return new TwitterTemplate(apiKey, apiSecret, accessToken, accessTokenSecret);
	    }

}
