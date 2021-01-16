package N18;

import org.w3c.dom.ls.LSOutput;

public class N18Q1 {
    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        function(node1, node3);
        Node node = node1;
        System.out.println(node.getValue());
        while (node.getNext() != null) {
            node = node.getNext();
            System.out.println(node.getValue());
        }
    }

    public static void function(Node head, Node nodeDelete) {
        if (head.getNext() == null) {
            head = null;
        }
        if (nodeDelete.getNext() == null) {
            Node node = head;
            while (node.getNext() != nodeDelete) {
                node = node.getNext();
            }
            node.setNext(null);
        } else {
            nodeDelete.setValue(nodeDelete.getNext().getValue());
            nodeDelete.setNext(nodeDelete.getNext().getNext());
        }
    }
}
