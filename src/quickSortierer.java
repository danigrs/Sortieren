import java.util.ArrayList;

public class quickSortierer extends Sortierer { // Erbt von Sortierer mittels (extends Sortierer)

    public quickSortierer(ArrayList<Integer> liste){
        super(liste); // Konstruktor der Elternklasse wird aufgerufen
    }

        // Ähnliches Prinzip wie in der Vorlesung mit den Binärbäumen
        protected ArrayList<Integer> sortiere(ArrayList<Integer> list){
        ArrayList<Integer> ersteListe = new ArrayList<Integer>(); // Liste für die Elemente, die kleiner oder gleich dem Pivot-Element sind
        ArrayList<Integer> zweiteListe = new ArrayList<Integer>(); // Liste für die Elemente, die größer als das Pivot-Element sind
        ArrayList<Integer> sortierteListe = new ArrayList<Integer>();

        if (list.size() <= 1){
            return list;
        } else {
            int pivotElement = list.get(0);
            // list.remove(0);
            for (int i = 1; i < list.size(); i++){
                if (list.get(i) <= pivotElement){
                    ersteListe.add(list.get(i));
                } else {
                    zweiteListe.add(list.get(i));
                }
            }
            sortierteListe.addAll(sortiere(ersteListe)); // Rekursive Sortierung der ersten Liste
            sortierteListe.add(pivotElement); // Pivot-Element hinzufügen (quasi immer die Mitte der beidem Listen)
            sortierteListe.addAll(sortiere(zweiteListe)); // Rekursive Sortierung der zweiten Liste
        }

        return sortierteListe;
    }
    
}
