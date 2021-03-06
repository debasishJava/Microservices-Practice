package deb.lip.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
public interface GreetClient {

	@GetMapping(
			value = "/greet",
			produces = "application/json"
			)
	public String getGreetMsg();
}
