import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> randomList = new ArrayList<Integer>();

        // Generiere eine zufällige Liste
        for (int i = 0; i < 500; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(2014 - 1900) + 1900;
            randomList.add(randomInt);
        }

        // Ausgabe der unsortierten Liste
        Ausgabe.liste(randomList);

        // Verwende die abstrakte Klasse Sortierer
        Sortierer insertSortierer = new insertSortierer(randomList);
        Sortierer quickSortierer = new quickSortierer(randomList);

        // Insertion Sort
        Ausgabe.insertSort();
        ArrayList<Integer> insertSortedList = insertSortierer.sortiere();
        Ausgabe.liste(insertSortedList);
        Ausgabe.zeit(insertSortierer.getOperations());

        // Quick Sort
        Ausgabe.quickSort();
        ArrayList<Integer> quickSortedList = quickSortierer.sortiere();
        Ausgabe.liste(quickSortedList);
        Ausgabe.zeit(quickSortierer.getOperations());
    }
}
