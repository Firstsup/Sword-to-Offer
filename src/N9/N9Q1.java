package N9;

import java.util.Stack;

public class N9Q1 {
    public static void main(String[] args) {
        Stack<Object> stack1 = new Stack<>();
        Stack<Object> stack2 = new Stack<>();
        functionAppendTail(stack1, "a");
        functionAppendTail(stack1, "b");
        functionAppendTail(stack1, "c");
        functionAppendTail(stack1, "d");
        functionDeleteHead(stack1, stack2);
        functionDeleteHead(stack1, stack2);
        functionAppendTail(stack1, "e");
        functionDeleteHead(stack1, stack2);
        functionDeleteHead(stack1, stack2);
        functionDeleteHead(stack1, stack2);
    }

    public static void functionAppendTail(Stack<Object> stack1, Object object) {
        stack1.push(object);
    }

    public static void functionDeleteHead(Stack<Object> stack1, Stack<Object> stack2) {
        if (stack2.size() == 0) {
            while (stack1.size() > 0) {
                Object object = stack1.peek();
                stack1.pop();
                stack2.push(object);
            }
        }
        Object object = stack2.peek();
        stack2.pop();
        System.out.println(object);
    }
}
