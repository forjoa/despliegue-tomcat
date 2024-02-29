package consonante;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Petit {
	@GetMapping("/test")
	public String test() {
		return "Hola";
	}

	@PostMapping("/mensaje")
	public String mensaje(String texto) {
		String msg = "Hola mundo";
		return msg;
		
	}
}