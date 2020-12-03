package N6;

public class N6Q2 {
    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node head = new Node(-1, node1);
        function(head.getNext());
    }

    public static void function(Node node) {
        if (node != null) {
            if (node.getNext() != null) {
                function(node.getNext());
            }
            System.out.print(node.getValue() + " ");
        }
    }
}
