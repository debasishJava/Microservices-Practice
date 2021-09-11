package deb.lip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GreetApiEureka02Application {

	public static void main(String[] args) {
		SpringApplication.run(GreetApiEureka02Application.class, args);
	}

}
