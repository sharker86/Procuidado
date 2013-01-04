package modelo;

// Generated 04-ene-2013 11:21:16 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil implements java.io.Serializable {

	private int identificador;
	private String nombre;
	private Set permisos = new HashSet(0);

	public Perfil() {
	}

	public Perfil(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public Perfil(int identificador, String nombre, Set permisos) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.permisos = permisos;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getPermisos() {
		return this.permisos;
	}

	public void setPermisos(Set permisos) {
		this.permisos = permisos;
	}

}
