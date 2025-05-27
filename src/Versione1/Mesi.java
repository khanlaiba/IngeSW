package Versione1;

public enum Mesi {
    GENNAIO, FEBBRAIO, MARZO, APRILE, MAGGIO, GIUGNO,
    LUGLIO, AGOSTO, SETTEMBRE, OTTOBRE, NOVEMBRE, DICEMBRE;
	//metodo che ritorna il mese corrispondente
    public static String getNomeMese(int mese) {
        return Mesi.values()[mese - 1].name();
    }
}