import java.util.ArrayList;

abstract class Sortierer {
    ArrayList<Integer> liste = new ArrayList<Integer>();
    long messung1;
    long messung2;
    

    public Sortierer(ArrayList<Integer> liste){
        this.liste = new ArrayList<Integer>(liste);
    }

    abstract protected ArrayList<Integer> sortiere(ArrayList<Integer> list);

    public ArrayList<Integer> sortiere() {
        messung1 = System.currentTimeMillis(); // Startzeit
        ArrayList<Integer> result = sortiere(liste); // Sortierlogik aufrufen
        messung2 = System.currentTimeMillis(); // Endzeit
        return result;
    }

    public long getOperations(){
        return messung2 - messung1;
    }
}
