package deb.lip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.feigns.FeignClient;

@RestController
public class WelcomeController {

	@Autowired
	private FeignClient gClient;
	
	@GetMapping(
			value = "/welcome",
			produces = "application/json"
			)
	public String welcome() {
		String welcome="Welcome To COVID World!!!!";
		
		return gClient.invokeGreet()+" "+welcome;
	}
}
