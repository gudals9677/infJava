package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("list = " + list);

        System.out.println("Collections.max(list) = " + Collections.max(list));
        System.out.println("Collections.min(list) = " + Collections.min(list));

        Collections.shuffle(list); // 랜덤으로 섞어주기
        System.out.println("shuffle list = " + list);

        Collections.sort(list); // 정렬
        System.out.println("sort list = " + list);
    }
}
