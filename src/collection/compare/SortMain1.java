package collection.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};
        System.out.println("array = " + Arrays.toString(array));

        Arrays.sort(array); // 정렬
        System.out.println("array2 = " + Arrays.toString(array));
    }
}
