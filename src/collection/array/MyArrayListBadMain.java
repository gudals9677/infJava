package collection.array;

public class MyArrayListBadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");

        System.out.println("numberList = " + numberList);

        Integer number1 = (Integer) numberList.get(0);
        System.out.println("number1 = " + number1);
        Integer number2 = (Integer) numberList.get(1);
        System.out.println("number2 = " + number2);
        Integer number3 = (Integer) numberList.get(2);
        System.out.println("number3 = " + number3);
    }



}
