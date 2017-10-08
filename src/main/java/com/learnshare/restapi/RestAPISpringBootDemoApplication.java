package com.learnshare.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.learnshare.restapi"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class RestAPISpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAPISpringBootDemoApplication.class, args);
	}
}
