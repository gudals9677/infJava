package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private int capacity = DEFAULT_CAPACITY;
    LinkedList<Integer>[] buckets;

    // 기본 생성자
    public MyHashSetV1() {
        initBuckets();
    }

    // capacity를 정할 수 있는 생성자
    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    /*
    *   배열에 값을 추가한다.
    *   - 값의 유무를 확인 후 성공 또는 실패처리
    * */
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        if(bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    /*
    *   배열에 값이 존재하는지 확인한다.
    * */
    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    /*
    *   특정 인덱스의 배열 값을 지운다.
    * */
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));

        if(result) {
            size--;
            return true;
        } else{
            return false;
        }
    }

    /*
    *   인덱스를 반환한다.
    * */
    public int hashIndex(int value) {
        return value % capacity;
    }

    /*
    *   배열의 크기만큼 각각의 해당 배열에 LinkedList 객체를 세팅한다.
    * */
    public void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    /*
    *   추가된 값의 개수를 반환한다.
    * */
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "size=" + size +
                ", capacity=" + capacity +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }
}
