package deb.lip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WelcomeApiEureka02Application {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeApiEureka02Application.class, args);
	}

}
