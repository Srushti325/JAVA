// Queue using Arrays
public class QueueStructure {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        // constructor of Queue
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // isEmpty()
        public static boolean isEmpty() {
            return rear == -1;
        }

        // isFull()
        public static boolean isFull() {
            return rear == size-1;
        }

        // Enque - add()
        public static void add(int data) {
            if(isFull()) {
                System.out.println("Overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        
        // deque- remove()
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;    
            }
            int front = arr[0];

            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        // peek()
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.print(q.peek());
            q.remove();
        }
    }
}  


// Circular Queue using Arrays
// public class QueueStructure {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear = -1;
//         static int front = -1;
//         // constructor of Queue
//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         // isEmpty()
//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         // isFull()
//         public static boolean isFull() {
//             return ((rear+1) % size) == front;
//         }

//         // Enque - add()
//         public static void add(int data) {
//             if(isFull()) {
//                 System.out.println("Overflow");
//                 return;
//             }

//             if(front == -1) {
//                 front = 0;      // 1st elelment add
//             }

//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }
        
//         // deque- remove()
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;    
//             }
//             int result = arr[front];

//             // Single element
//             if(rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         // peek()
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[front];
//         }
        
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);
//         System.out.println(q.remove());
//         q.add(7);


//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// } 


// Queue using Linked List
// public class QueueStructure {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }
        
//         // add()
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if(tail == null) {
//                 tail = head = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             int front = head.data;
//             if(head == tail) {
//                 tail = null;
//             }
//             head = head.next;
//             return front;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue();
//         Queue.add(1);
//         Queue.add(2);
//         Queue.add(3);
//         Queue.add(4);
//         Queue.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }

// Queue using Java collection framework
// import java.util.Queue;
// import java.util.ArrayDeque;
// import java.util.LinkedList;
// public class QueueStructure {
//     public static void main(String args[]) {
//         // Queue<Integer> q = new LinkedList<>(); 
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



// Implementation of Queue using 2 stacks
// import java.util.*;
// public class QueueStructure {
//     static class Queue {
//         static Stack<Integer> s1 = new Stack<>(); 
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         public static void add(int data) {
//             while(!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }


//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }