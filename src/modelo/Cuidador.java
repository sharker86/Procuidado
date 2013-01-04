package modelo;

// Generated 04-ene-2013 11:21:16 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Cuidador generated by hbm2java
 */
public class Cuidador implements java.io.Serializable {

	private int identificador;
	private NotificacionDeEmergencia notificacionDeEmergencia;
	private boolean esCuidadorPorDefecto;
	private String telefono1;
	private String telefono2;
	private Set notificacionDeEmergencias = new HashSet(0);
	private Set restriccionHorarias = new HashSet(0);
	private Set residentes = new HashSet(0);
	private Set guardias = new HashSet(0);
	private Set casas = new HashSet(0);
	private Set solicitudDeCambioDeGuardias = new HashSet(0);

	public Cuidador() {
	}

	public Cuidador(NotificacionDeEmergencia notificacionDeEmergencia,
			boolean esCuidadorPorDefecto, String telefono1) {
		this.notificacionDeEmergencia = notificacionDeEmergencia;
		this.esCuidadorPorDefecto = esCuidadorPorDefecto;
		this.telefono1 = telefono1;
	}

	public Cuidador(NotificacionDeEmergencia notificacionDeEmergencia,
			boolean esCuidadorPorDefecto, String telefono1, String telefono2,
			Set notificacionDeEmergencias, Set restriccionHorarias,
			Set residentes, Set guardias, Set casas,
			Set solicitudDeCambioDeGuardias) {
		this.notificacionDeEmergencia = notificacionDeEmergencia;
		this.esCuidadorPorDefecto = esCuidadorPorDefecto;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.notificacionDeEmergencias = notificacionDeEmergencias;
		this.restriccionHorarias = restriccionHorarias;
		this.residentes = residentes;
		this.guardias = guardias;
		this.casas = casas;
		this.solicitudDeCambioDeGuardias = solicitudDeCambioDeGuardias;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public NotificacionDeEmergencia getNotificacionDeEmergencia() {
		return this.notificacionDeEmergencia;
	}

	public void setNotificacionDeEmergencia(
			NotificacionDeEmergencia notificacionDeEmergencia) {
		this.notificacionDeEmergencia = notificacionDeEmergencia;
	}

	public boolean isEsCuidadorPorDefecto() {
		return this.esCuidadorPorDefecto;
	}

	public void setEsCuidadorPorDefecto(boolean esCuidadorPorDefecto) {
		this.esCuidadorPorDefecto = esCuidadorPorDefecto;
	}

	public String getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public Set getNotificacionDeEmergencias() {
		return this.notificacionDeEmergencias;
	}

	public void setNotificacionDeEmergencias(Set notificacionDeEmergencias) {
		this.notificacionDeEmergencias = notificacionDeEmergencias;
	}

	public Set getRestriccionHorarias() {
		return this.restriccionHorarias;
	}

	public void setRestriccionHorarias(Set restriccionHorarias) {
		this.restriccionHorarias = restriccionHorarias;
	}

	public Set getResidentes() {
		return this.residentes;
	}

	public void setResidentes(Set residentes) {
		this.residentes = residentes;
	}

	public Set getGuardias() {
		return this.guardias;
	}

	public void setGuardias(Set guardias) {
		this.guardias = guardias;
	}

	public Set getCasas() {
		return this.casas;
	}

	public void setCasas(Set casas) {
		this.casas = casas;
	}

	public Set getSolicitudDeCambioDeGuardias() {
		return this.solicitudDeCambioDeGuardias;
	}

	public void setSolicitudDeCambioDeGuardias(Set solicitudDeCambioDeGuardias) {
		this.solicitudDeCambioDeGuardias = solicitudDeCambioDeGuardias;
	}

}
