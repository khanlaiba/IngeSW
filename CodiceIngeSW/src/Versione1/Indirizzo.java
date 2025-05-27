package Versione1;
import java.util.List;

public class Indirizzo {
    private TipoStrada tipoStrada;
    private List<String> nomeStrada;  // può essere composto da più parole
    private String numeroCivico;
    private String cap;

    public Indirizzo(TipoStrada tipoStrada, List<String> nomeStrada, String numeroCivico, String cap) {
        this.tipoStrada = tipoStrada;
        this.nomeStrada = nomeStrada;
        this.numeroCivico = numeroCivico;
        this.cap = cap;
    }
}