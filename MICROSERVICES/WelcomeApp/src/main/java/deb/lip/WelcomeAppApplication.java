package deb.lip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WelcomeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeAppApplication.class, args);
	}

}
