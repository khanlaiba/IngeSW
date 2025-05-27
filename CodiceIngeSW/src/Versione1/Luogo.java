package Versione1;

public class Luogo {
	private String nomeLuogo;
	private String descrizione;
	private Indirizzo indirizzo;
	
	public Luogo(String nomeLuogo, String descrizione, Indirizzo indirizzo) {
		this.nomeLuogo = nomeLuogo;
		this.descrizione = descrizione;
		this.indirizzo = indirizzo;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Luogo: \n");
		sb.append(String.format("Nome: %s\n", nomeLuogo));
		sb.append(String.format("Descrizione: %s\n", descrizione));
		sb.append(String.format("Indirizzo: %s\n", indirizzo.toString()));
		
		return sb.toString();
	}
	

	
	//getters & setters
	
	public String getNomeLuogo() {
		return nomeLuogo;
	}

	public void setNomeLuogo(String nomeLuogo) {
		this.nomeLuogo = nomeLuogo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
