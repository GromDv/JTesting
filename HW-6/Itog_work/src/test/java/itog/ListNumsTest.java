package itog;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static itog.ListNums.compareListsAverage;

class ListNumsTest {
    ListNums list1, list2;

    @Test
    void compareListsAverage_ifAveragesIsEqualTest() {
        ListNums list1 = new ListNums(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));
        ListNums list2 = new ListNums(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));

        assert compareListsAverage(list1, list2).equals("Средние значения равны");

    }

    @Test
    void compareListAverage_ifArgIsNull() {
        ListNums list1 = new ListNums(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));
        ListNums list2 = null;

        assert compareListsAverage(list1, list2).equals("Что-то не так со списками, возможно кого-то нет...");
    }
    @Test
    void compareListAverage_ifAvg1GtAvg2() {
        ListNums list1 = new ListNums(new ArrayList(Arrays.asList(6, 2, 3, 4, 5)));
        ListNums list2 = new ListNums(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));

        assert compareListsAverage(list1, list2).equals("Первый список имеет большее среднее значение");
    }
    @Test
    void compareListAverage_ifAvg2GtAvg1() {
        ListNums list1 = new ListNums(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));
        ListNums list2 = new ListNums(new ArrayList(Arrays.asList(6, 2, 3, 4, 5)));

        assert compareListsAverage(list1, list2).equals("Второй список имеет большее среднее значение");
    }
    @Test
     void compareListAverage_ifArgIsStr() throws ClassCastException {
        ListNums list1 = new ListNums(new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));
        ListNums list2 = new ListNums(new ArrayList(Arrays.asList("kjhk")));

        assert compareListsAverage(list1, list2).equals("Что-то не так со списками, возможно тип...");
//        Throwable thrown = assertThrows(ClassCastException.class, () -> {
//            compareListsAverage(list1, list2);
//        });
//        assertNotNull(thrown.getMessage());
    }
}