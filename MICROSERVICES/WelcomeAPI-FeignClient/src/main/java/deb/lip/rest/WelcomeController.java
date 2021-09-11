package deb.lip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.client.GreetClient;

@RestController
public class WelcomeController {

	@Autowired
	private GreetClient greet;
	
	@GetMapping(
			value = "/welcome",
			produces = "application/json"
			)
	public String greetAndWelcome() {
		return greet.getGreetMsg()+" Welcome to Coforge.....";
	}
}
