package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PreDestroy
	public void onExit() {
		System.out.println("### Executing predestroy hook ###");
		try {
			Thread.sleep(TimeUnit.MINUTES.toMillis(5));
		} catch (InterruptedException e) {
			System.out.printf("Error while execution of shutdown hook, %s\n", e);
		}
		System.out.println("### STOP FROM THE LIFECYCLE ###");
	}
}
