package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A",100);
        map.put("B",80);
        map.put("C",30);
        map.put("D",40);
        map.put("E",60);

        System.out.println("map = " + map);

        System.out.println("map.get(\"A\") = " + map.get("A"));

        // 키 값 가져오기
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("value1 = " + value);
        }

        // 키 값을 저장하는 객체
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }

        // 모든 값 가져오기
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value2 = " + value);
        }
    }
}
