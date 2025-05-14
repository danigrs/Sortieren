import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      	ArrayList<Integer> randomList = new ArrayList<Integer>();
        insertSortierer insertSortedList = new insertSortierer(randomList);
        quickSortierer quickSortedList = new quickSortierer(randomList);


        for (int i = 0; i < 500; i++){
            Random random = new Random();
            int randomInt = random.nextInt(2014 - 1900) + 1900;
            randomList.add(randomInt);
        }

        // System.out.println(randomList);

        // Test aus Aufgabe 3
        Ausgabe.liste(randomList);
        Ausgabe.insertSort();
        insertSortedList.sortiere(randomList);
        Ausgabe.liste(insertSortedList.sortiere(randomList));
        // Ausgabe.zeit(0);
        Ausgabe.quickSort();
        quickSortedList.quickSort(randomList);
        Ausgabe.liste(quickSortedList.quickSort(randomList));
    }
}
