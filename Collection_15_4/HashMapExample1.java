package thisIsJava.Collection_15_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("둥이", 85);
        map.put("둥2", 90);
        map.put("둥3", 80);
        map.put("둥이", 95);
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t둥이 : " + map.get("둥이"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }

        map.remove("둥이");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
