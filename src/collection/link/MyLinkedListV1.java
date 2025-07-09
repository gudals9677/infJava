package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    // 마지막에 데이터를 추가한다.
    public void add(Object e) {
        Node newNode = new Node(e);

        if (first == null) { // 기존 노드가 없다면 새로 생성한다.
            first = newNode;
        } else { // 기존 노드가 있다면 마지막에 새로운 노드 추가한다.
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    // 특정 인덱스에 노드를 추가한다.(기존 인덱스의 노드 데이터 반환)
    public Object set(int index, Object el) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = el;
        return oldValue;
    }

    // 특정 인덱스의 노드 데이터를 반환한다.
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    // 특정 인덱스의 노드를 반환한다.
    public Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 마지막 노드를 조회한다.
    private Node getLastNode() {
        Node x = first;
        while(x.next != null) { // 현재 노드의 next가 null이 아닐 때 까지 조회한다.
            x = x.next;
        }
        return x; // 노드의 next가 null인 노드가 반환된다.
    }

    // 특정 노드의 인덱스 값을 반환한다. 없다면 -1를 반환한다.
    public int indexOf(Object e) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
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
}
