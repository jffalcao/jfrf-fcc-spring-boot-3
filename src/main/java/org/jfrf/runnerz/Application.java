package org.jfrf.runnerz;

import org.jfrf.runnerz.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jfrf.runnerz.run.Location;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// WelcomeMessage welcomeMessage = new WelcomeMessage();
		// System.out.println(welcomeMessage.getWelcomeMessage());

		log.info("Application has started succesfully!");
		}
	
		@Bean
		CommandLineRunner runner() {
			return args -> {
				// Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.Type.INDOOR);
				Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.INDOOR);
				log.info("Run: "+run);
			};
		}
}		
	