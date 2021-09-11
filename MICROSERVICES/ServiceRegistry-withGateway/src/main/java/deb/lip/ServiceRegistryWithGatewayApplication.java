package deb.lip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryWithGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryWithGatewayApplication.class, args);
	}

}
