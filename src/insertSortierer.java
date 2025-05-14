import java.util.ArrayList;

public class insertSortierer {
    
    public insertSortierer(ArrayList<Integer> liste){
        super();
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> list){
        // messung1 = System.currentTimeMillis();
        // sortiere
        // messung2 = System.currentTimeMillis();

        ArrayList<Integer> liste = new ArrayList<Integer>(list);

        int j, help;
        for (int i = 0; i < liste.size() - 1; i++) {
            help = liste.get(i+1); // aktuelles Element
            j =i ;
            while ((j >= 0) && (help < liste.get(j))) {
                liste.set(j + 1, liste.get(j)); // list[j] ist frei
                j--;
            } // list[j+1] ist frei

            liste.set(j + 1, help); // list[1 ... i+1] ist sortiert

        }

        return liste;
    }
}
