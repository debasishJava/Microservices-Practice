package deb.lip.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping(
			value = "/greet",
			produces = "application/json"
			)
	public String greetMessage() {
		return "Hello, How Are You?";
	}
}
