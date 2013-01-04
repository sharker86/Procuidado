package modelo;

// Generated 04-ene-2013 11:21:16 by Hibernate Tools 3.4.0.CR1

/**
 * ConstanteLeidaId generated by hbm2java
 */
public class ConstanteLeidaId implements java.io.Serializable {

	private int identificadorConstanteActiva;
	private String fechaHora;
	private double valor;

	public ConstanteLeidaId() {
	}

	public ConstanteLeidaId(int identificadorConstanteActiva, String fechaHora,
			double valor) {
		this.identificadorConstanteActiva = identificadorConstanteActiva;
		this.fechaHora = fechaHora;
		this.valor = valor;
	}

	public int getIdentificadorConstanteActiva() {
		return this.identificadorConstanteActiva;
	}

	public void setIdentificadorConstanteActiva(int identificadorConstanteActiva) {
		this.identificadorConstanteActiva = identificadorConstanteActiva;
	}

	public String getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConstanteLeidaId))
			return false;
		ConstanteLeidaId castOther = (ConstanteLeidaId) other;

		return (this.getIdentificadorConstanteActiva() == castOther
				.getIdentificadorConstanteActiva())
				&& ((this.getFechaHora() == castOther.getFechaHora()) || (this
						.getFechaHora() != null
						&& castOther.getFechaHora() != null && this
						.getFechaHora().equals(castOther.getFechaHora())))
				&& (this.getValor() == castOther.getValor());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdentificadorConstanteActiva();
		result = 37 * result
				+ (getFechaHora() == null ? 0 : this.getFechaHora().hashCode());
		result = 37 * result + (int) this.getValor();
		return result;
	}

}
