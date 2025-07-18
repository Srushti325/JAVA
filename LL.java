class LL {
    Node head;
    private int size;
    
    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first and add last
    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        // traverse
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


    // print list
    public void printList() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    // delete first and delete last
    // delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        size--; 
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a"); 
        list.addFirst("is");
        list.printList();
        list.addLast("List"); 
        list.printList();
        list.addFirst("This");
        list.printList();

        // delete
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}


// Using collection framework
// import java.util.LinkedList;
// class LL {
//     public static void main(String args []) {
//         LinkedList<String> list = new LinkedList<String>();
//         list.addFirst("a");
//         list.addFirst("is");
//         System.out.println(list);

//         list.addLast("List");
//         System.out.println(list);
//         list.addFirst("This");          //if we write list.add("This") it by default gets added to the end of the list but for adding element at the beginning we need to mention "first".
//         System.out.println(list);

//         System.out.println(list.size());

//         for(int i=0; i<list.size(); i++) {
//             System.out.print(list.get(i) + "->");
//         }
//         System.out.println("Null");

//         // list.removeFirst();
//         // System.out.println(list);

//         // list.removeLast();
//         // System.out.println(list);

//         list.remove(3);
//         System.out.println(list);
//     }
// }










// Practice


// class LL {
//     Node head;
//     private int size;
//     LL() {
//         this.size = 0;
//     }

//     class Node {
//         String data;
//         Node next;

//         // constructor
//         Node(String data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add- first
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     // add- last
//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while(currNode.next != null) {
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }


//     // Add- middle
//     public void addMidde(int index, String data) {
//         if(index<0 || index>size) {
//             System.out.println("invalid Index");
//         }
//         size++;
//         Node newNode = new Node(data);
//         if(head == null || index == 0) {
//             newNode.next = head;
//             head = newNode;
//             return;
//         }

//         Node currNode = head;

//         for(int i=1; i<size; i++) {
//             if(i == index) {
//                 Node nextNode = currNode.next;
//                 currNode.next = newNode;
//                 newNode.next = nextNode;
//                 break;
//             }
//             currNode = currNode.next;
//         }
//     }

//     // print list
//     public void printList() {
//         if(head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null) {
//             System.out.print(currNode.data + "->");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }



//     // delete first
//     public void deleteFirst() {
//         if(head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     // delete last
//     public void deleteLast() {
//         if(head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         size--;
//         if(head.next == null) {
//             head = null;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;

//         while(lastNode.next != null) {
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }

//     public int getSize() {
//         return size;
//     }


//     public static void main(String args[]) {
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("is");
//         list.printList();
//         list.addLast("List");
//         list.printList();

//         list.addFirst("This");
//         list.printList();

//         list.deleteFirst();
//         list.printList();

//         list.addMidde(2, "hey");
//         list.printList();
//         System.out.println(list.getSize());
//     }
// }



// Collection framework
// import java.util.LinkedList;
// class LL {
//     public static void main(String args[]) {
//         LinkedList<String> list = new LinkedList<String>();
//         list.addFirst("a");
//         list.addFirst("is");
//         list.addFirst("This");
//         System.out.println(list);
//         list.addLast("list");
//         System.out.println(list);
//     }
// }



/* Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
Search for the number 7 & display its index.*/ 
// import java.util.*;
// class LL {
//     Node head;
//     private int size;
//     LL() {
//         this.size = 0;
//     }
//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add first
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }


//     // add last
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null) {
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }


//     // print list
//     public void printList() {
//         if(head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null) {
//             System.out.print(currNode.data + "->");
//             currNode = currNode.next;
//         }
//         System.out.print("NULL");
//     }

    
//     public void searchElement(int value) {
//         if(head == null) {
//             System.out.println("List empty");
//         }
//         Node currNode = head;
//         int index = -1;
//         for(int i=0; i<size; i++) {
//             if(currNode.data == value) {
//                 index = i;
//                 break;
//             }
//             currNode = currNode.next;
//         }
//         if(index == -1) {
//             System.out.println("No element found");
//         } else {
//             System.out.println("Index of the node " + value + " is " + index);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         LL list = new LL();
//         list.addFirst(1);
//         list.addLast(5);
//         list.addLast(7);
//         list.addLast(3);
//         list.addLast(8);
//         list.addLast(2);
//         list.addLast(3);
//         list.printList();

//         System.out.println("Enter value to search: ");
//         int value = sc.nextInt();

//         list.searchElement(value);

//     }
// }



/*
Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
Delete all nodes which have values greater than 25.
*/
// import java.util.Scanner;
// class LL {
//     Node head;
//     private int size;
//     LL() {
//         this.size = 0;
//     }
//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//     }
// }




// LL Practice 2
// Make functions - AddFirst, AddLast, DeleteFirst, DeleteLast, Print, ReverseIterate, ReverseRecursive, getsize, AddMiddle
// import java.util.*;
// class LL {
//     Node head;
//     private int size;
//     LL() {
//         this.size = 0;
//     }
//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // AddFirst
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }



//     // AddLast
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null) {
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }



//     // AddMiddle
//     public void addMiddle(int index, int data) {
//         if(index> size || index<0) {
//             System.out.println("Invalid Index");
//         }
//         // size++;
//         Node newNode = new Node(data);
//         if(head == null || index == 0) {
//             newNode.next = head;
//             head = newNode;
//         }
//         Node currNode = head;
//         for(int i=1; i<size; i++) {
//             if(i == index) {
//                 Node nextNode = currNode.next;
//                 currNode.next = newNode;
//                 newNode.next = nextNode;
//                 break;
//             }
//             currNode = currNode.next;
//         }
//     }


//     // getsize
//     public int getSize() {
//         return size;
//     }



//     // printList()
//     public void printList() {
//         if(head == null) {
//             System.out.println("List is empty");
//         }
//         Node currNode = head;
//         while(currNode != null) {
//             System.out.print(currNode.data + "->");
//             currNode = currNode.next;
//         }
//         System.out.print("NULL");
//     }



//     // deleteFirst()
//     public void deleteFirst() {
//         if(head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     public void deleteLast() {
//         if(head == null) {
//             System.out.println("List is empty");
//         }
//         size--;
//         if(head.next == null) {
//             head = null;
//             return;
//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null) {
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }


//     // Reverse Iterate
//     public void reverseIterate() {
//         if(head == null || head.next == null) {
//             return;
//         }
//         Node prevNode = head;
//         Node currNode = head.next;
//         while(currNode != null) {
//             Node nextNode = currNode.next;
//             currNode.next = prevNode;

//             // updation
//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         head = prevNode;
//     }


//     // Reverse Recursion
//     public Node reverseRecursive(Node head) {
//         if(head == null || head.next == null) {
//             return head;
//         }
//         Node newHead = reverseRecursive(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
//     }
//     public static void main(String args[]) {
        
//         // LL list = new LL();
//         // list.addFirst(10);
//         // list.addLast(20);
//         // list.addLast(30);
//         // list.addLast(40);
//         // list.addLast(50);
//         // list.addLast(60);

//         // list.printList();
//         // list.head = list.reverseRecursive(list.head);
//         // System.out.println();
//         // list.printList();


//         LinkedList<Integer> list = new LinkedList<Integer>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         for(int i=0; i<list.size(); i++) {
//             System.out.print(list.get(i) + "->");
//         }
//         System.out.print("NULL");
//         System.out.println();
//         Collections.reverse(list);
//         for(int i=0; i<list.size(); i++) {
//             System.out.print(list.get(i) + "->");
//         }
//         System.out.print("NULL");
//     }
// }