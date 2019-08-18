package sorting;

import java.util.*;
import java.util.Map.Entry;

public class Question2 {
    public static Map<String, Integer> markMap = new HashMap<>();
    public static Map<Integer, List<String>> indexMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] arrayStr = str.split(" ");

            for (int i = 0; i < arrayStr.length; i++) {
                if (i == arrayStr.length - 1) {
                    searchEqual(i, arrayStr[i].trim(), arrayStr[0].trim());
                } else {
                    searchEqual(i, arrayStr[i].trim(), arrayStr[i + 1].trim());
                }
            }

            Entry<Integer, List<String>> preEntry = null;
            Set<Entry<Integer, List<String>>> entrySet = indexMap.entrySet();
            for (Entry<Integer, List<String>> entry : entrySet) {
                if (entry.getValue().isEmpty()) {
                    System.out.println(false);
                    return;
                }
                if (entry.getValue().size() >= 2) {
                    continue;
                }

                if (entry.getValue().size() == 1 && preEntry != null && preEntry.getValue().size() == 1) {
                    if (entry.getValue().get(0).equals(preEntry.getValue().get(0))) {
                        System.out.println(false);
                        return;
                    }
                }
                preEntry = entry;
            }
            System.out.println(true);
        }
    }


    public static void searchEqual(int index, String str1, String str2) {
        indexMap.put(index, new ArrayList<String>());
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(String.valueOf(str1.charAt(i)))) {
                indexMap.get(index).add(String.valueOf(str1.charAt(i)));
            }
        }
    }
}
