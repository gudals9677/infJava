package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        // 배열 첫번째 위치에 추가
        System.out.println("=== 배열 첫번째 위치에 추가 ===");
        int newValue = 3;

        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // 배열의 index 위치에 추가
        System.out.println("=== 배열 index 위치에 추가 ===");
        int index = 2;
        int value = 4;

        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        System.out.println("=== 배열 마지막 위치에 추가 ===");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length -1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
