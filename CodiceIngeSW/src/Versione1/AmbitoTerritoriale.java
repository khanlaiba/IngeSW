package Versione1;

import java.util.ArrayList;

public class AmbitoTerritoriale {
	
	private ArrayList<String> cap; 
	private String provincia;
	
	public AmbitoTerritoriale(ArrayList<String> cap, String provincia) {
		this.cap = cap;
		this.provincia = provincia;
	}
	
	/*public boolean contieneCap (String capConfronto) {
		return cap.contains(capConfronto);
	}*/
	
	public boolean confronto(Indirizzo indirizzo) {
		return cap.contains(indirizzo.getCap());
	}

	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("L'ambito territoriale prescelto è la provincia di: %s", provincia));
		return sb.toString();
	}
	
	
	//getters & setters
	
	public ArrayList<String> getCap() {
		return cap;
	}

	public void setCap(ArrayList<String> cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
}
