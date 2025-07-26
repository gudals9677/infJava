package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 배열로 Map 생성
        Map<String, Integer> map = new HashMap<>();
        for (String[] product : productArr) {
            String key = product[0];
            String value = product[1];
            map.put(key, Integer.valueOf(value));
        }
        // Map 출력
        System.out.println("map = " + map);
    }
}
