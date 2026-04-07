package collection_framework_List;

import java.util.LinkedList;
import java.util.Stack;

public class Stack_four {
    public static void main(String[] args) {
        //LIFO(Las In First Out)

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();

        System.out.println(stack);

       Integer peek = stack.peek();

       //we use linklist in single trade
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
