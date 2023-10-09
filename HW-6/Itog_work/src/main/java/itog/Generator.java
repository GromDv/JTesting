package itog;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    public static Random rnd = new Random();
    public static ArrayList<Integer> generateListNums(int qnty) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < qnty; i++)
            list.add(rnd.nextInt(100));
        return list;
    }
}
