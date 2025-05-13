import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      	ArrayList<Integer> randomList = new ArrayList<Integer>();

        for (int i = 0; i < 500; i++){
            Random random = new Random();
            int randomInt = random.nextInt(2014 - 1900) + 1900;
            randomList.add(randomInt);
        }

        // System.out.println(randomList);

    }
}
