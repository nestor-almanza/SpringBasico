package com.mitocode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

//Esta clase va a tener la definicion de los beans,
//Va a representar el beans.xml
@Configuration
public class AppConfig {
	
	/*Metodo que retorna un objeto de tipo Persona*/
	/*Esto es un bean , un objeto inyectado por el container de Spring , se usa la anotaciòn @Ben*/
	@Bean(name="persona")
	public Persona persona(){
		return new Persona();
	}
	
	@Bean(name="personaService")
	public IPersonaService iPersonaService(){
		return new PersonaServiceImpl();
	}
}
