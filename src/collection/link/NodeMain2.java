package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        // 노드 생성 후 연결하기 (A -> B -> C)
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first.toString());
    }
}
