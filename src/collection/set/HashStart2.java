package collection.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        //inputArray = [null, 1, 2, null, null, 5, null, null, 8, null]
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
