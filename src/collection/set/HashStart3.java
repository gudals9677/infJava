package collection.set;

import java.util.Arrays;

public class HashStart3 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY];

        add(inputArray,10);
        add(inputArray,24);
        add(inputArray,8);
        add(inputArray,99);

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 조회
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("hashIndex = " + hashIndex);
        Integer value = inputArray[hashIndex];
        System.out.println("value = " + value);
    }

    private static void add(Integer[] inputArray ,int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
     }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
