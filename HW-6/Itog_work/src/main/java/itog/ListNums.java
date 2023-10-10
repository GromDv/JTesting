package itog;

import java.util.ArrayList;


public class ListNums {

    public ArrayList<Integer> getList() {
        return list;
    }
    public int getSize() {
        return list.size();
    }

    private final ArrayList<Integer> list;
    public ListNums(int num) {
        list = Generator.generateListNums(num);
    }
    public ListNums(ArrayList<Integer> nums){
            list = nums;
        }


    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{ ");
        for (Integer num : list) {
            result.append(String.format("%d, ", num));
        }
        result.replace(result.length() - 2, result.length() - 1, "");
        result.append("}");
        return result.toString();
    }

}
