package itog;

import java.util.OptionalDouble;

public class ListNumsAverages {
    public static String compareListsAverage(ListNums list1, ListNums list2) {
        if (list1 == null || list2 == null)
            return "Что-то не так со списками, возможно кого-то нет...";
        try {
            System.out.println(((Integer) list2.getList().get(0)));
        } catch (ClassCastException ex) {
            return "Что-то не так со списками, возможно тип...";
        }

        OptionalDouble avg1opt = list1.getList().stream().mapToDouble(x -> (double) x).average();
        OptionalDouble avg2opt = list2.getList().stream().mapToDouble(x -> (double) x).average();
        Double avg1, avg2;

        avg1 = avg1opt.getAsDouble();
        avg2 = avg2opt.getAsDouble();
        if (avg1.equals(avg2))
            return "Средние значения равны";
        if (avg1 > avg2)
            return "Первый список имеет большее среднее значение";
        else
            return "Второй список имеет большее среднее значение";

    }
}
