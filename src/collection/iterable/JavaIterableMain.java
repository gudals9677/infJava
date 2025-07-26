package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        foreach(set);
    }

    private static void foreach(Iterable<Integer> itr) {
        for(Integer i : itr) {
            System.out.println("foreach i = " + i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        while(iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
