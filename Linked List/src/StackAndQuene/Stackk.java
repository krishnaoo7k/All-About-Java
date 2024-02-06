package StackAndQuene;

import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(11);
        stack.push(2);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());






//        while(!stack.isEmpty()){                   //! this is bcz we want to reverse the condition (opposite of)
//            System.out.println(stack.pop());
//        }

    }
}
