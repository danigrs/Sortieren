import java.util.ArrayList;

public class insertSortierer extends Sortierer { // Erbt von Sortierer mittels (extends Sortierer)
    
    public insertSortierer(ArrayList<Integer> liste){
        super(liste); // Konstruktor der Elternklasse wird aufgerufen
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> list){
        ArrayList<Integer> liste = new ArrayList<Integer>(list); // Zur Vermeidung von Seiteneffekten

        int j, help;
        for (int i = 0; i < liste.size() - 1; i++) {
            help = liste.get(i+1); // aktuelles Element
            j = i;
            while ((j >= 0) && (help < liste.get(j))) {
                liste.set(j + 1, liste.get(j)); // liste.get(j) ist frei
                j--;
            } // liste.get(j+1) ist frei

            liste.set(j + 1, help); // liste[1 ... i+1] ist sortiert

        }

        return liste;
    }
}
