import java.util.ArrayList;

abstract class Sortierer {
    ArrayList<Integer> liste = new ArrayList<Integer>();
    long messung1;
    long messung2;
    

    // Erstellt Kopie der übergebenen Liste, um Seiteneffekte zu vermeiden
    public Sortierer(ArrayList<Integer> liste){
        this.liste = new ArrayList<Integer>(liste);
    }

    abstract protected ArrayList<Integer> sortiere(ArrayList<Integer> list);

    public ArrayList<Integer> sortiere() {
        messung1 = System.currentTimeMillis(); // Startzeit
        ArrayList<Integer> result = sortiere(liste); // Sortierlogik aufrufen und Ergebnis speichern
        messung2 = System.currentTimeMillis(); // Endzeit
        return result; // Sortierte Liste zurückgeben
    }

    public long getOperations(){
        return messung2 - messung1;
    }
}
