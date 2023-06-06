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
        //TODO Hinzufügen eines Kurses, den ein Lehrer unterrichten muss.
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
