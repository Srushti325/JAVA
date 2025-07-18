// Implementation of Stack using linked list
import java.util.*;
public class StackClass {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("Enter the number of elements to push: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println("Enter element " + (i+1) + ":");
            s.push(sc.nextInt());
        }

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}




// Implementation of Stack using CF- ArrayList
// import java.util.Scanner;
// import java.util.ArrayList;
// public class StackClass {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         // isEmpty
//         public static boolean isEmpty() {
//             return (list.size() == 0);
//         }

//         // push
//         public static void push(int data) {
//             list.add(data);
//         }

//         // pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         // peek
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Stack s = new Stack();
//         System.out.println("Enter the number of elements to push: ");
//         int n = sc.nextInt();

//         for(int i=0; i<n; i++) {
//             System.out.println("Enter element " + (i+1) + ":");
//             s.push(sc.nextInt());
//         }

//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
// }



// Implementation of Stack using CF (STACK)
// import java.util.Scanner;
// import java.util.Stack;
// public class StackClass {
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         System.out.println(s.peek());
//         System.out.println(s.size());
//         // while(!s.isEmpty()) {
//         //     System.out.println(s.pop());
//         // }
//     }
// }


// Push at the bottom of the stack
// import java.util.Stack;
// public class StackClass {
//     public static void pushAtBottom(int data, Stack<Integer> s) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(data, s);
//         s.push(top);
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);

//         pushAtBottom(50, s);
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
// }


// Reversing a stack
// import java.util.Stack;
// public class StackClass {
//     public static void pushAtBottom(int data, Stack<Integer> s) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(data, s);
//         s.push(top);
//     }

//     public static void reverse(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         reverse(s);
//         pushAtBottom(top, s);
//     } 
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);

//         pushAtBottom(50, s);
//         reverse(s);
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         } 
//     }
// }


// Revise
// public class StackClass {
//     static class Node {
//         int data;
//         Node next;
//         public Node (int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         public static Node head;

//         // isEmpty()
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // push()
//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if(isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         // pop()
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // peek()
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// Stack using array list
// import java.util.ArrayList;
// public class StackClass {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         // isEmpty()
//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         // push()
//         public static void push(int data) {
//             list.add(data);
//         }

//         // pop()
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         // peek()
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//     }
// }

// }



// Stack using java collection framework
// import java.util.Stack;
// public class StackClass {
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



// Push at bottom
// import java.util.Stack;
// public class StackClass {
//     public static void pushAtBottom(int data, Stack<Integer> s) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(data, s);
//         s.push(top);
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBottom(4, s);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// Reverse Stack
// import java.util.Stack;
// public class StackClass {

//     // PushAtBottom()
//     public static void pushAtBottom(int data, Stack<Integer> s) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(data, s);
//         s.push(top);
//     }

//     // Reverse()
//     public static void reverse(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         reverse(s);
//         pushAtBottom(top, s);
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         reverse(s);

//         while(!s.empty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }