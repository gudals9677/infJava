package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    // 마지막에 데이터를 추가한다.
    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (first == null) { // 기존 노드가 없다면 새로 생성한다.
            first = newNode;
        } else { // 기존 노드가 있다면 마지막에 새로운 노드 추가한다.
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    /*
     *   Case1)
     *   첫번째 위치에 노드를 추가하는 경우.
     *   1. 신규 노드의 next에 기존의 첫 노드를 넣어준다.
     *   2. 첫 노드에 신규노드를 넣는다.
     *
     *   Case2)
     *   중간 지점에 노드를 추가하는 경우.
     *   1. 집어넣을 위치의 이전 노드를 조회한다.
     *   2. 이전 노드의 next를 신규 노드의 next로 넣어준다.(이전노드 -> 신규노드 -> 기존 이전노드의 다음노드)
     *   3. 이전 노드의 next에 신규 노드를 넣어준다.
     * */
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) { // Case1
            newNode.next = first;
            first = newNode;
        } else { // Case2
            Node<E> prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    /*
    *   Case1)
    *   첫번째 노드를 삭제하는 경우
    *   1. 삭제 할 첫번째 노드의 다음 노드를 첫번째로 지정해준다.
    *
    *   Case2)
    *   중간 위치의 노드를 삭제하는 경우
    *   1. 이전 노드를 찾는다.
    *   2. 이전 노드의 다음 노드로 삭제 될 노드의 다음 노드를 지정해준다.
    * */
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) { // Case1
            first = removeNode.next;
        } else { // Case2
            Node<E> prevNode = getNode(index - 1);
            prevNode.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    // 특정 인덱스에 노드를 추가한다.(기존 인덱스의 노드 데이터 반환)
    public E set(int index, E el) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = el;
        return oldValue;
    }

    // 특정 인덱스의 노드 데이터를 반환한다.
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    // 특정 인덱스의 노드를 반환한다.
    public Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 마지막 노드를 조회한다.
    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next != null) { // 현재 노드의 next가 null이 아닐 때 까지 조회한다.
            x = x.next;
        }
        return x; // 노드의 next가 null인 노드가 반환된다.
    }

    // 특정 노드의 인덱스 값을 반환한다. 없다면 -1를 반환한다.
    public int indexOf(E e) {
        int index = 0;
        for(Node<E> x = first; x != null; x = x.next) {
            if (e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // 사이즈를 반환한다.
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }
}
