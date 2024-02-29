package consonante;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domains.User;

@RestController
public class Pedir {

	@GetMapping("/nombre")
	public String name() {
		return "Me llamo Paco";
		
	}
	
	@PostMapping("/fruta")
	public String mensaje(String texto) {
		String msg = "Melocoton";
		return msg;
		
	}
	
	@GetMapping("/buscaNombre")
	public User buscarNombre(@RequestParam(name="nombre")String nombre) {
		User u = new User(nombre, "contrase");
		return u;
	}
	
	@GetMapping("/todosUsers")
	public ArrayList<User>user() {
		ArrayList<User> us = new ArrayList();
		us.add(new User("Paco123", "pass12", "Paco","AA111223"));
		us.add(new User("Nacho12", "pass1245", "Nacho","AVV11223"));
		us.add(new User("Raul12", "pa45", "Raul","A12224223"));
		return us;
	}
}
