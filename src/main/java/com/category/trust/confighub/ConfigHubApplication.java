package com.category.trust.confighub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigHubApplication.class, args);
	}

}
