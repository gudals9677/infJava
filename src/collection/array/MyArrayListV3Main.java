package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        System.out.println("== 데이터 추가 ==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("== addLast ==");
        list.add("addLast");
        System.out.println(list);

        System.out.println("== addFirst ==");
        list.add(0,"addFirst");
        System.out.println(list);

        Object remove = list.remove(4);
        System.out.println("remove = " + remove);
        System.out.println("list = " + list);

    }
}
