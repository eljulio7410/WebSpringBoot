package com.jgutierrez.primeraweb;




import com.jgutierrez.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PrimeraWebSpringbootApplication{


	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {

		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

	}

	/*
	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(5L, "Estebandido", 33));
		personaService.crearPersona(new Persona(6L, "Sandra", 4));
		personaService.crearPersona(new Persona(7L, "Andres", 37));
		personaService.crearPersona(new Persona(8L, "Camilo", 40));

		System.out.println("numero de personas de la tabla : " + personaService.contarPersonas());

		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("nombre de la persona : " + p.getNombre()));
	}*/
}
