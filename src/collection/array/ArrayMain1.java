package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("==== arr 세팅 ====");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        // arr[2] 값 조회
        System.out.println("==== arr 조회 ====");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==== arr 검색 ====");
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value + " 검색완료");
                break;
            }
        }
    }
}
