package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] array = {user1, user2, user3};
        System.out.println("array = " + Arrays.toString(array));

        System.out.println("기본정렬");
        Arrays.sort(array);
        System.out.println("array2= " + Arrays.toString(array));
    }
}
