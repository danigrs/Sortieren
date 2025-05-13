import java.util.ArrayList;

abstract class Sortierer {
    ArrayList<Integer> liste = new ArrayList<Integer>();
    long messung1;
    long messung2;
    

    public Sortierer(ArrayList<Integer> liste){
        this.liste = new ArrayList<Integer>(liste);
    }

    abstract protected ArrayList<Integer> sortiere(ArrayList<Integer> list){
        messung1 = System.currentTimeMillis();
        // sortiere
        messung2 = System.currentTimeMillis();
        // return ArrayList
    }

    public ArrayList<Integer> sortiere(){
        return sortiere(liste);
    }

    public long getOperations(){
        return messung2 - messung1;
    }
}
