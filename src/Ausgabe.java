import java.util.ArrayList;

public class Ausgabe {
    public static void liste(ArrayList<Integer> list){
        for (int i = 1; i <= list.size(); i++){
            System.out.print(list.get(i-1) + " ");
            if (i % 30 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void mergeSort(){
        System.out.println("Sortiert mit mergeSort!");
    }

    public static void quickSort(){
        System.out.println("Sortiert mit quickSort!");        
    }

    public static void insertSort(){
        System.out.println("Sortiert mit insertSort!");
    }

    public static void zeit(long millis){
        System.out.println("Benötigte Rechenzeit: 0." + millis + "s");
    }
}
