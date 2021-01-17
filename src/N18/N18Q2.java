package N18;

public class N18Q2 {
    public static void main(String[] args) {
        Node node8 = new Node(5, null);
        Node node7 = new Node(5, node8);
        Node node6 = new Node(4, node7);
        Node node5 = new Node(3, node6);
        Node node4 = new Node(3, node5);
        Node node3 = new Node(2, node4);
        Node node2 = new Node(1, node3);
        Node node1 = new Node(1, node2);
        Node head = function(node1);
        System.out.println(head.getValue());
        while (head.getNext() != null) {
            head = head.getNext();
            System.out.println(head.getValue());
        }
    }

    public static Node function(Node head) {
        if (head.getNext() == null) {
            return head;
        }
        Node p;
        int tempValue = head.getValue();
        while (head.getNext() != null) {
            if (head.getNext().getValue() == tempValue) {
                head = head.getNext();
            } else {
                break;
            }
        }
        p = head;
        while (p.getNext() != null) {
            Node q = p;
            tempValue = p.getValue();
            if (p.getNext().getValue() != tempValue) {
                p = p.getNext();
            }
            while (p.getNext().getValue() == tempValue) {
                if (p.getNext().getNext() == null) {
                    q.setNext(null);
                    return head;
                }
                p = p.getNext();
                q.setNext(p.getNext());
            }
        }
        return head;
    }
}
