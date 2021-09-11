package deb.lip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GreetApiEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApiEurekaClientApplication.class, args);
	}

}
