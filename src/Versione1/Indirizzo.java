package Versione1;

public class Indirizzo {
	private TipoStrada tipoStrada;
	private String nomeStrada;
	private String numeroCivico;
	private String cap;
	private String comune;
	private String provincia;
	
	public Indirizzo(TipoStrada tipoStrada, String nomeStrada, String numeroCivico, String cap, String comune,
			String provincia) {
		this.tipoStrada = tipoStrada;
		this.nomeStrada = nomeStrada;
		this.numeroCivico = numeroCivico;
		this.cap = cap;
		this.comune = comune;
		this.provincia = provincia;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("Indirizzo: "));
		sb.append(String.format("%s %s %s, %s %s (%s)", tipoStrada, nomeStrada, numeroCivico, cap, comune, provincia));
		
		return sb.toString();
	}
	
	
	

	//getters & setters

	public TipoStrada getTipoStrada() {
		return tipoStrada;
	}

	public void setTipoStrada(TipoStrada tipoStrada) {
		this.tipoStrada = tipoStrada;
	}

	public String getNomeStrada() {
		return nomeStrada;
	}

	public void setNomeStrada(String nomeStrada) {
		this.nomeStrada = nomeStrada;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
}