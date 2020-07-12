package thisIsJava.Collection_15_5;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "홍길동");
        scores.put(98, "와우");
        scores.put(75, "끄응");
        scores.put(95, "둥이");
        scores.put(80, "뱃뱃");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
        System.out.println();
        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendingSet = ascendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : ascendingSet) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
    }
}
