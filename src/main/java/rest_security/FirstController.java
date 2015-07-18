package rest_security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/test")
	public void greeting() {
		System.out.println("bla");
	}

}
