package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // 노드 생성 후 연결하기 (A -> B -> C)
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("first = " + first);

        System.out.println("== 모든 노드 탐색하기 ==");
        printAll(first);

        System.out.println("== 마지막 노드 탐색하기 ==");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        System.out.println("== 특정위치의 노드 탐색하기 ==");
        int index = 1;
        Node thirdNode = getNode(first, index);
        System.out.println("thirdNode = " + thirdNode);

        System.out.println("== 마지막 위치에 node 추가 ==");
        add(first, "D");
        System.out.println("node 추가 후 체크 = " + first);

    }

    private static void printAll(Node node) {
        Node x = node;
        while(x != null) {
            System.out.println("x = " + x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
