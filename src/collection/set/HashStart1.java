package collection.set;

import java.util.Arrays;

public class HashStart1 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        for (Integer data : inputArray) {
            if(data == 2) {
                System.out.println("중복값 = " + data);
            }
        }

    }
}
