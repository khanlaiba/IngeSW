package Versione1;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ListaTipoVisita {
	private ArrayList<TipoVisita> tipi ;

	public ListaTipoVisita() {
		this.tipi = new ArrayList <TipoVisita>();
	}
	
    /*public boolean siSovrappongono(TipoVisita a, TipoVisita b) {
    	//mi manca la parte del periodo di Roxy, poi la sistemiamo così abbiamo il codice
    	//corretto scritto direttamente alla fine
        //return inizioA.isBefore(fineB) && inizioB.isBefore(fineA);
    }*/
    /*public boolean aggiungiTIpoVisita(TipoVisita nuova) {
        for (TipoVisita esistente : tipi) {
            if (siSovrappongono(esistente, nuova)) {
                return false; // effettuiamo il controllo ancora prima di aggiungerla per evitare sovrapposizioni
            }
        }
        tipi.add(nuova);
        return true;
    }*/
    
}
