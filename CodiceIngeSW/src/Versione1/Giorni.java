package Versione1;

public enum Giorni {
    LUNEDI,
    MARTEDI,
    MERCOLEDI,
    GIOVEDI,
    VENERDI,
    SABATO,
    DOMENICA;

    public static String getNomeGiorno(int giorno) {
        return Giorni.values()[giorno - 1].name();
    }
}