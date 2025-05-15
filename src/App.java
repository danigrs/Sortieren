import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> randomList = new ArrayList<Integer>();

        // Generieren einer zufälligen Liste
        for (int i = 0; i < 500; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(2014 - 1900) + 1900; // Man könnte auch (114) + 1900 schreiben, für bessere Lesbarkeit allerdings (2014 - 1900) + 1900
            randomList.add(randomInt);
        }

        // Ausgabe der unsortierten Liste
        System.out.println("Unsortierte Liste:");
        Ausgabe.liste(randomList);

        // Verwenden der abstrakten Klasse Sortierer
        Sortierer insertSortierer = new insertSortierer(randomList); // Neues Objekt der Unterklasse insertSortierer
        Sortierer quickSortierer = new quickSortierer(randomList); // Neues Objekt der Unterklasse quickSortierer

        // Insertion Sort
        Ausgabe.insertSort();
        ArrayList<Integer> insertSortedList = insertSortierer.sortiere(); // Aufruf der Methode sortiere() der Elternklasse, über die Instanz der Unterklasse (Erbung)
        Ausgabe.liste(insertSortedList);
        Ausgabe.zeit(insertSortierer.getOperations());

        // Quick Sort
        Ausgabe.quickSort();
        ArrayList<Integer> quickSortedList = quickSortierer.sortiere(); // Aufruf der Methode sortiere() der Elternklasse, über die Instanz der Unterklasse (Erbung)
        Ausgabe.liste(quickSortedList);
        Ausgabe.zeit(quickSortierer.getOperations());
    }
}
