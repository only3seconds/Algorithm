package pinduoduo;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        map.put("Five", 5);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry);
        }

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry);
        }
    }
}