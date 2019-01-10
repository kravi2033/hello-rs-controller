package com.hello.Wordcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hello")
public class WordcontrollerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordcontrollerApplication.class, args);
	}

}

