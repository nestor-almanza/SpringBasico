package com.mitocode.model;

import org.springframework.beans.factory.annotation.Value;

public class Persona {
	
	/*ya no utilizamos el *.xml, se usa el bean con valores por defecto*/
	@Value("1")
	private int id;
	@Value("Alexis")
	private String nombres;
	@Value("Adalid")
	private String apellidos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
