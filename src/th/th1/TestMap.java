package th.th1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 30);
        hashMap.put("b", 31);
        hashMap.put("c", 29);
        hashMap.put("d", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("g", 30);
        linkedHashMap.put("f", 31);
        linkedHashMap.put("a", 29);
        linkedHashMap.put("h", 29);
        System.out.println("\nThe age for " + "h is " + linkedHashMap.get("a"));
    }
}
