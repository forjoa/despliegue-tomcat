package consonante;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domains.ejemplos;

@RestController
public class Petit {
	@GetMapping("/test")
	public String test() {
		return "Hola mundo";
	}
	@PostMapping("/mensaje")
	public String mensaje(String texto) {
		texto = "buen trabajo";
		return texto;
		
	}
	@GetMapping("/buscarNombre")
	public ejemplos buscarNombre(@RequestParam (name = "nombre")String nombre) {
		ejemplos p1 = new ejemplos(nombre,"perez", 10);
		return p1;
		
	}
	@GetMapping("/searchAll")
	public ArrayList<ejemplos>ej() {
		ArrayList<ejemplos> mt = new ArrayList<ejemplos>();
		mt.add(new ejemplos("juan", "gonzalez", 18));
		mt.add(new ejemplos("pedro", "sanchez", 32));
		mt.add(new ejemplos("leo", "fierro", 29));
		return mt;
	}
	@PostMapping("/filtroEdad")
	public ArrayList<ejemplos> filtroAnio(@RequestBody ArrayList<ejemplos> listaMotos) {
		ArrayList<ejemplos> mt = new ArrayList<ejemplos>();
		for(ejemplos m : listaMotos) {
			if(m.getEdad()>=30) {
				mt.add(m);
			}
		}
		return mt;
	}
}
