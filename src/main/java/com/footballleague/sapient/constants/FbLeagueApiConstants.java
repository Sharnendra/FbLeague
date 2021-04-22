package com.footballleague.sapient.constants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix="competitions")
@EnableConfigurationProperties
@Component
public class FbLeagueApiConstants {
	private UrlData urls;

	public UrlData getUrls() {
		return urls;
	}

	public void setUrls(UrlData urls) {
		this.urls = urls;
	}
	
}
