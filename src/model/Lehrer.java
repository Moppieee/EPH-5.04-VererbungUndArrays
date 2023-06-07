package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends Persona{

    //Attribute
    private String besoldungsGruppe;

    //Referenzen
    private Kurs[] kurseDesLehrers;
    private Unterrichtsfach[] faecherDesLehrers;

    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {

        this.besoldungsGruppe = besoldungsGruppe;
    }


    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }



}
