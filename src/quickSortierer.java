import java.util.ArrayList;

public class quickSortierer extends Sortierer { // Erbt von Sortierer

    public quickSortierer(ArrayList<Integer> liste){
        super(liste);
    }

        protected ArrayList<Integer> sortiere(ArrayList<Integer> list){
        ArrayList<Integer> ersteListe = new ArrayList<Integer>();
        ArrayList<Integer> zweiteListe = new ArrayList<Integer>();
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
            sortierteListe.addAll(sortiere(ersteListe));
            sortierteListe.add(pivotElement);
            sortierteListe.addAll(sortiere(zweiteListe));
        }

        return sortierteListe;
    }
    
}
