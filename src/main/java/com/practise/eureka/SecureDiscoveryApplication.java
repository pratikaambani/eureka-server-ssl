package com.practise.eureka;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
public class SecureDiscoveryApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SecureDiscoveryApplication.class).run(args);
	}

}
