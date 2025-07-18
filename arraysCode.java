// Q1. ENTER STUDENT MARKS
// import java.util.*;
// public class arrays {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int marks [] = new int [3];
//         System.out.print("Enter marks of physics: ");
//         marks[0] = sc.nextInt();
//         System.out.print("Enter marks of chemistry: ");
//         marks[1] = sc.nextInt();
//         System.out.print("Enter marks of maths: ");
//         marks[2] = sc.nextInt();

//         System.out.println("All marks are: ");
//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//     }
// }


// Q2. TAKE AN ARRAY AS INPUT FROM THE USER AND CHECK IF A PARTICULAR NUMBER EXISTS. IF YES THEN PRINT THE IDEX OF THAT NUMBER.
// import java.util.*;
// public class arraysCode {
//     public static int checkNumber (int arr[], int x) {
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] == x) {
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter array elements: ");
//         for(int i=0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("The array elements are: ");
//         for(int i=0; i<n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("\nEnter number to find: ");
//         int x = sc.nextInt();

//         int val = checkNumber(arr, x);
//         if(val != -1) {
//             System.out.println("Index is " + val);
//         }else {
//             System.out.println("No element present in the array");
//         }
        
//     }
// }


//                                                         EXERCISE
// Q1.TAKE AN ARRAY OF NAMES AS INPUT FROM THE USER AND PRINT THEM ON THE SCREEN.
// import java.util.*;
// public class arraysCode {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of the array: ");
//         int n = sc.nextInt();                                          //declare array and array size
//         String names [] = new String [n];

//         System.out.println("Enter names: ");                         //input array    
//         for(int i=0; i<n; i++) {
//             names[i] = sc.next();                             //check with names[i] = sc.nextLine;
//         }

//         System.out.println("The array names are: ");
//         for(int i=0; i<names.length; i++) {                                        //print array names
//             System.out.println(names[i]);
//         }

//     }
// }



//Q2. FIND MAX AND MIN IN THE ARRAY OF INTEGERS
// import java.util.*;
// public class arraysCode {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of the array: ");
//         int n = sc.nextInt();
//         int arr [] = new int [n];

//         System.out.println("Enter the elements of the array: ");
//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();                                                  //inut array elements
//         }

//         System.out.println("The array is: ");
//         for(int i=0; i<arr.length; i++) {                                             //display array elements
//             System.out.print(arr[i] + " ");
//         }

//         int min = arr[0];
//         for(int i=0; i<n; i++) {
//             if(arr[i]<min) {
//                 min = arr[i];
//             }
//         }
//         System.out.println("\nThe minimum value of the array is: " + min);

//         int max = arr[0];
//         for(int i=0; i<n; i++) {
//             if(arr[i]>max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("The maximum value of the array is: " + max);



//     }
// }


//Q3. TAKE AN ARRAY FROM THE USER AND CHECK IF THE ARRAY IS IN ASCENDING ORDER OR NOT.
// import java.util.*;
// public class arraysCode {
//     public static void checkAscending(int arr[]) {
//         boolean isAscending = true;
//         for(int i=0; i<arr.length-1; i++) {
//             if(arr[i]>arr[i+1]) {
//                 isAscending = false;
//             }
//         }
//         if(isAscending == true) {
//             System.out.println("Sorted in order");
//         } else {
//             System.out.println("not sorted");
//         }
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();

//         int arr[] = new int [n];

//         System.out.println("Enter the elements of the array: ");
//         for(int i=0; i<arr.length; i++) {                                          //input array elements
//             arr[i] = sc.nextInt();                                          
//         }

//         System.out.println("The array is: ");
//         for(int i=0; i<arr.length; i++) {                                         //display array
//             System.out.print(arr[i] + " ");
//         }

//         checkAscending(arr); 

//     }
// }