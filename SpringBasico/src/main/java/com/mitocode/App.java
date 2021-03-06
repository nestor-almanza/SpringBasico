package com.mitocode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

public class App {
	public static void main(String[] args) {
		/*
		 * ya no necesitamos leer el xml, ya solo se leerá la anotacion 
		 * usando AbstractApplicationContext y se indica la clase que será el motor
		 * de inyección donde se encuentra la definicón de todos los beans
		 * */
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IPersonaService service = (IPersonaService) context.getBean("personaService");
		
		/*Accediendo al bean*/
		Persona per = (Persona) context.getBean("persona");
		System.out.println(per.getId() + " " + per.getNombres() + " " + per.getApellidos());
		service.crear();
		//cerrando el recurso xml
		context.close();
	}
}
