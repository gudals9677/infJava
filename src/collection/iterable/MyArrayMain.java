package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray arr = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        for (int value : arr) {
            System.out.println("value = " + value);
        }
    }
}
