package itog;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class ListNums {
    private ArrayList<Integer> list;

//    public ListNums(int num) {
//        list = Generator.generateListNums(num);
//    }
    public ListNums(ArrayList nums){
        list = nums;
    }

    public static String compareListsAverage(ListNums list1, ListNums list2) {
        if (list1 == null || list2 == null)
            return "Что-то не так со списками, возможно кого-то нет...";
        try {
            System.out.println(((Integer) list2.list.get(0)));
        } catch (ClassCastException ex)
        {
            return "Что-то не так со списками, возможно тип...";
        }

        OptionalDouble avg1opt = list1.list.stream().mapToDouble(x -> (double) x).average();
        OptionalDouble avg2opt = list2.list.stream().mapToDouble(x -> (double) x).average();
        Double avg1, avg2;
        if (avg1opt.isPresent() && avg2opt.isPresent()) {
            avg1 = avg1opt.getAsDouble();
            avg2 = avg2opt.getAsDouble();
            if (avg1.equals(avg2))
                return "Средние значения равны";
            if (avg1 > avg2)
                return "Первый список имеет большее среднее значение";
            else
                return "Второй список имеет большее среднее значение";
        }
        return "Что-то не так со списками, проверьте...";
    }
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        result.append("{ ");
//        for (Integer num : list) {
//            result.append(String.format("%d, ", num));
//        }
//        result.replace(result.length() - 2, result.length() - 1, "");
//        result.append("}");
//        return result.toString();
//    }
}
