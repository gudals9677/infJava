package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';

        //hashCode
        int hashCode = hashCode("A");
        System.out.println("hashCode = " + hashCode);

        //hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);

        System.out.println("hashIndex = " + hashIndex);
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
