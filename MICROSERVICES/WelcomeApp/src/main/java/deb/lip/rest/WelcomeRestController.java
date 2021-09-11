package deb.lip.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping(
			value = "/welcome",
			produces = "application/json"
			)
	public String getMessage() {
		return "Welcome To Coforge....";
	}
}
