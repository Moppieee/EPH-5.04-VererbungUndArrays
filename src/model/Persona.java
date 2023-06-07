package model;


public class Persona {
    //Attribute
    private String name;
    private int alter;


    //Referenzen

    public Persona(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public Persona() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    public void addKurs(Kurs neuerKurs){

        Kurs[] gold = new Kurs[kurse.length + 1];
        for(int i = 0; i < kurse.length; i++){
            gold[i] = kurse[i];
        }

    }

    public void addFach(Unterrichtsfach neuesFach){
        //TODO Hinzufügen eines Faches, das ein Schulleiter unterrichten kann.
    }

    public String getInfo(){
        String info = "";
        //TODO Kompakte Zeichenkette zu den Informationen eines Schulleiters - gut lesbar!
        return info;
    }
}
