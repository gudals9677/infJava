package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);

        System.out.println("== 데이터 추가 ==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
        list.add("g");
        System.out.println(list);

        System.out.println("== 기능사용시작 ==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get() = " + list.get(1));
        System.out.println("list.indexOf() = " + list.indexOf("c"));
        System.out.println("list.set(\"z\") = " + list.set(2,"z"));
        System.out.println("list = " + list);

    }
}
