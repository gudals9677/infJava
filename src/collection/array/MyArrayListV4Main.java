package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();

        stringList.add("문자 1");
        stringList.add("문자 2");
        stringList.add("문자 3");

        String list1 = stringList.get(0);
        System.out.println("list1 = " + list1);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        Integer list2 = intList.get(0);
        System.out.println("list2 = " + list2);

    }
}
