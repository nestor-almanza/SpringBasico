package com.mitocode;

import org.springframework.context.annotation.Configuration;

import com.mitocode.model.Persona;

//Esta clase va a tener la definicion de los beans,
//Va a representar el beans.xml
@Configuration
public class AppConfig {
	
	/*Metodo que retorna un objeto de tipo Persona*/
	public Persona persona(){
		return new Persona();
	}
}
