package deb.lip.feigns;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "GREET-API")
public interface FeignClient {

	@GetMapping(
			value = "/greet",
			produces = "application/json"
			)
	public String invokeGreet();
}
