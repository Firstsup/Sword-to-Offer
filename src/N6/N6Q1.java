package N6;

import java.util.Stack;

public class N6Q1 {
    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node head = new Node(-1, node1);
        Stack<Integer> stack = function(head);
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static Stack<Integer> function(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
            stack.push(node.getValue());
        }
        return stack;
    }
}
