import java.util.Stack;

//Write a method equals that takes as parameters two stacks of integers and 
//returns true if the two stacks are equal and that returns false otherwise. 
//To be considered equal, the two stacks would have to store the same sequence 
//of integer values in the same order. Your method is to examine the two stacks 
//but must return them to their original state before terminating. You may use one
//stack as auxiliary storage.

public class equals {

    public static void main(String[] args) {

        Stack<Integer> equals1 = new Stack<Integer>();
        equals1.push(2);
        equals1.push(4);
        equals1.push(6);
        equals1.push(8);

        Stack<Integer> equals2 = new Stack<Integer>();
        equals2.push(1);
        equals2.push(3);
        equals2.push(5);
        equals2.push(7);

        System.out.println(equals(equals1, equals2));

        Stack<Integer> notEqual1 = new Stack<Integer>();
        notEqual1.push(4);
        notEqual1.push(6);
        notEqual1.push(8);
        notEqual1.push(10);

        Stack<Integer> notEqual2 = new Stack<Integer>();
        notEqual2.push(3);
        notEqual2.push(5);
        notEqual2.push(7);
        notEqual2.push(9);

        System.out.println(equals(notEqual1, notEqual2));
    }

    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> s = new Stack<Integer>();
        boolean equal = true;
        int size1 = s1.size();
        int size2 = s2.size();

        if (size1 != size2)
            return false;

        while (!s1.isEmpty()) {
            int n1 = s1.pop();
            int n2 = s2.pop();
            s.push(n1);
            s.push(n2);

            if (n1 != n2) {
                equal = false;
            }
        }

        while (!s.isEmpty()) {
            s2.push(s.pop());
            s1.push(s.pop());
        }

        return equal;
    }
}
