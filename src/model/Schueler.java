package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Persona{

    //Referenzen
    private Kurs[] kurseDesSchuelers;
    private Tadel[] tadelDesSchuelers;


    public Schueler(String name, int alter) {


    }

    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    private void addTadel(Tadel neuerTadel){
        //TODO Hinzufügen eins Tadels für den Schüler.
    }


}
