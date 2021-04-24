package com.footballleague.sapient.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {

	@Value("${resources.windows-resource}")
	private String windowResource;

	@Value("${resources.linux-resource}")
	private String linuxResource;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/footballStranding/**").addResourceLocations(windowResource)
				.addResourceLocations(linuxResource);
	}
}