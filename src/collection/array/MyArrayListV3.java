package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elData;
    private int size = 0;

    // size가 5인 배열 생성
    public MyArrayListV3() {
        elData = new Object[DEFAULT_CAPACITY];
    }

    // 임의의 size를 가진 배열 생성
    public MyArrayListV3(int initCapacity) {
        elData = new Object[initCapacity];
    }

    // size를 리턴
    public int size() {
        return size;
    }

    // 배열에 데이터를 추가함. 추가 시 사이즈 증가
    public void add(Object e) {
        // 기존 배열의 사이즈에 도달했다면 * 2의 사이즈를 가진 새로운 배열 생성
        if (size == elData.length) {
            grow();
        }

        elData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        // 기존 배열의 사이즈에 도달했다면 * 2의 사이즈를 가진 새로운 배열 생성
        if (size == elData.length) {
            grow();
        }

        // 데이터 이동
        shiftRightFrom(index);
        elData[index] = e;
        size++;
    }

    // 요소 마지막 부터 인덱스까지 오른쪽을 데이터 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index ; i--) {
            elData[i] = elData[i - 1];
        }
    }

    // 코드추가
    private void grow() {
        int oldCapacity = elData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elData = Arrays.copyOf(elData, newCapacity);
    }

    // 해당 인덱스의 데이터를 가져옴
    public Object get(int index) {
        return elData[index];
    }

    // 해당 인덱스에 데이터를 변경하고 기존 데이터 반환
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elData[index] = element;
        return oldValue;
    }

    public Object remove(int index) {
        Object oldValue = get(index);

        shiftLeftFrom(index);

        size --;
        elData[size] = null;
        return oldValue;
    }

    // 지워진 요소의 index를 기점으로 데이터를 인덱스까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1 ; i++) {
            elData[i] = elData[i + 1];
        }
    }

    // 검색기능. 인수와 같은 데이터가있는 배열의 인덱스를 반환. 없다면 -1을 리턴
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elData[i])) {
                return i;
            }
        }
        return -1;
    }

    // size 크기만큼만 출력
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elData, size)) +
                " size =" + size + ", capacity =" + elData.length;
    }
}
