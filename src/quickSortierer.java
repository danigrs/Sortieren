import java.util.ArrayList;


public class quickSortierer {

    public quickSortierer(ArrayList<Integer> liste){
        super();
    }

        protected ArrayList<Integer> quickSort(ArrayList<Integer> list){
        // messung1 = System.currentTimeMillis();
        // sortiere
        // messung2 = System.currentTimeMillis();

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
            sortierteListe.addAll(quickSort(ersteListe));
            sortierteListe.add(pivotElement);
            sortierteListe.addAll(quickSort(zweiteListe));
        }



        return sortierteListe;
    }
    
}
