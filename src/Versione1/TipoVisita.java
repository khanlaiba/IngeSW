package Versione1;
import java.time.LocalTime;

public class TipoVisita {
    
	private String titolo;
    private String descrizione;
    private Indirizzo puntoDiIncontro;
    private data dataVisita;
    private List<GiornoSettimana> giorniSettimana;
    private LocalTime oraInizio;
    private int durataVisita;
    private boolean biglietto;
    private int sogliaMinPartecipanti;
    private int sogliaMaxPartecipanti;
    //private Set<Volontario> volontari;
    
    public TipoVisita(String titolo, String descrizione, Indirizzo puntoDiIncontro, LocalTime oraInizio,
			int durataVisita, boolean biglietto, int sogliaMinPartecipanti, int sogliaMaxPartecipanti) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.puntoDiIncontro = puntoDiIncontro;
		this.oraInizio = oraInizio;
		this.durataVisita = durataVisita;
		this.biglietto = biglietto;
		this.sogliaMinPartecipanti = sogliaMinPartecipanti;
		this.sogliaMaxPartecipanti = sogliaMaxPartecipanti;
	}

	public Data getDataVisita() {
		return dataVisita;
	}

	public LocalTime getOraInizio() {
		return oraInizio;
	}

	public int getDurataVisita() {
		return durataVisita;
	}
    
    
    
}
