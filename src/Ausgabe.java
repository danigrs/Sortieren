import java.util.ArrayList;

public class Ausgabe {
    public static void liste(ArrayList<Integer> list){
        for (int i = 1; i <= list.size(); i++){
            System.out.print(list.get(i) + " ");
            if (i % 30 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
