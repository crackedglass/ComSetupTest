package ru.crackedglass.ComSetupTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ComSetupTestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ComSetupTestApplication.class, args);
	}

	@Override
	public void run(String... args){
		log.info("I'm running!");
	}
}
