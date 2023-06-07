package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schulleiter extends Persona{

    //Attribute
    private String besoldungsGruppe;

    //Referenzen
    private Kurs[] kurseDesLehrers;
    private Unterrichtsfach[] faecherDesLehrers;

    /**
     * Ein Objekt der Klasse Schulleiter hebt sich von einem Lehrer einzig dadurch ab,
     * dass es einem Schüler einen Tadel ausstellen kann.
     * @param name
     * @param alter
     * @param besoldungsGruppe
     */
    public Schulleiter(String name, int alter, String besoldungsGruppe) {

        this.besoldungsGruppe = besoldungsGruppe;
    }


    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }




    /**
     * Einem Schüler wird ein Tadel hinzugefügt.
     * @param s Der zu tadelnde Schüler.
     * @param t Der Tadel.
     */
    public void tadelEinenSchueler(Schueler s, Tadel t){
        //TODO Umsetzung dafür, dass ein Schulleiter einem Schüler einen Tadel geben kann.
    }


}
