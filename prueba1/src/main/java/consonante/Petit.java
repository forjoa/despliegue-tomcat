package consonante;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Petit {

	@PostMapping("/test")
	public String test() {
		return "Hola mundo!";
	}

}
