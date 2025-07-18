// Tower of Hanoi
import java.util.*;
public class recursion2 {
    public static void towerOfHanoi(int n, String scr, String help, String dest) {
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + scr + " to " + dest);
            return;
        }
        if(n == 0 ) {
            return;
        }

        towerOfHanoi(n-1, scr, dest, help);
        System.out.println("Transfer disk " + n + " from " + scr + " to " + dest);
        towerOfHanoi(n-1, help, scr, dest);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // input n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // function call
        towerOfHanoi(n, "S", "H", "D");
    }
}


// reverse a string
// import java.util.*;
// public class recursion2 {
//     public static void strRev(String str, int index) {
//         if(index == 0) {
//             System.out.print(str.charAt(index));
//             return;
//         }
//         System.out.print(str.charAt(index));
//         strRev(str, index-1);
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input string
//         System.out.print("Enter string: ");
//         String str = sc.next();

//         // function call
//         strRev(str, str.length()-1);

//     }
// }

// Find the first and last occurance of an element in the string using recursion
// import java.util.*;
// public class recursion2 {
//     // static variables
//     public static int first = -1;
//     public static int last = -1;

//     // function 
//     public static void findOccurance(String str, int index, char element) {
//         if(index == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currentChar = str.charAt(index);
//         if(currentChar == element) {
//             if(first == -1) {
//                 first = index;
//             } else {
//                 last = index;
//             }
//         }
//         findOccurance(str, index+1, element);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input string
//         System.out.print("Enter a string: ");
//         String str = sc.next();

//         // index i
//         int i = 0;

//         // input element to find
//         System.out.print("Enter element to find: ");
//         char element = sc.next().charAt(0);

//         // function call
//         findOccurance(str, i, element);
//     }
// }


// Check if the array is sorted(Strictly increasing)
// import java.util.*;
// public class recursion2 {
//     public static boolean isIncreasing(int arr[], int i) {
//         if(i == arr.length-1) {
//             return true;
//         }
//         if(arr[i] >= arr[i+1]) {
//             // array is not sorted
//             return false;
//         } else {
//             return isIncreasing(arr, i+1);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // array size
//         System.out.print("Enter array size: ");
//         int size = sc.nextInt();

//         // declare array
//         int arr[] = new int [size];

//         // input array elements:
//         System.out.println("Enter array elements: ");
//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // display array
//         System.out.print("The array is: ");
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         // index
//         int i = 0;

//         // function call
//         System.out.println(isIncreasing(arr, i));
//      }
// }


// move all "x" at the end of the string
// import java.util.*;
// public class recursion2 {
//     public static void moveAllX(String str, int i, int count, String newStr) {
//         if(i == str.length()) {
//             for(int j=0; j<count; j++) {
//                 newStr = newStr + 'x';
//             }
//             System.out.println(newStr);
//             return;
//         }
//         char currChar = str.charAt(i);
//         if(currChar == 'x') {
//             count++;
//             moveAllX(str, i+1, count, newStr);
//         } else {
//             newStr = newStr + currChar;
//             moveAllX(str, i+1, count, newStr);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // String
//         String str = "axbcxxd";

//         // New string
//         String newStr = "";

//         // index
//         int i = 0;

//         // count
//         int count = 0;

//         // function call
//         moveAllX(str, i, count, newStr);
//     }
// }


// Remove all duplicates
// import java.util.*;
// public class recursion2 {
//     public static boolean [] map = new boolean [26];

//     // function
//     public static void removeDuplicates(String str, int index, String newStr) {
//         // base case
//         if(index == str.length()) {
//             System.out.println(newStr);
//             return;
//         }
//         int currChar = str.charAt(index);
//         if(map[currChar - 'a'] == true) {
//             removeDuplicates(str, index+1, newStr);
//         } else {
//             newStr = newStr + str.charAt(index);
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, index+1, newStr);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input string
//         System.out.print("Enter string: ");
//         String str = sc.next();

//         // index
//         int index = 0;

//         // new string
//         String newStr = "";

//         // function call
//         removeDuplicates(str, index, newStr);
//     }
// }


// Print all subsequences
// import java.util.*;
// public class recursion2 {
//     public static void subsequences(String str, int index, String newStr) {
//         // base case
//         if(index == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         char currChar = str.charAt(index);

//         // to be
//         subsequences(str, index+1, newStr+currChar);

//         // not to be
//         subsequences(str, index+1, newStr);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         String str = "abc";

//         int index = 0;

//         String newStr = "";

//         subsequences(str, index, newStr);
//     }
// }


// Print all unique subsequences 
// import java.util.*;
// import java.util.HashSet;
// public class recursion2 {
//     public static void subsequences(String str, int index, String newStr, HashSet<String> set) {
//         // base case
//         if(index == str.length()) {
//             if(set.contains(newStr)) {
//                 return;
//             } else {
//                 System.out.println(newStr);
//                 set.add(newStr);
//                 return;
//             }
//         }

//         char currChar = str.charAt(index);

//         // to be
//         subsequences(str, index+1, newStr+currChar, set);

//         // not to be
//         subsequences(str, index+1, newStr, set);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         String str = "aaa";

//         // Hash set
//         HashSet<String> set = new HashSet<>();

//         int index = 0;

//         String newStr = "";

//         subsequences(str, index, newStr, set);
//     }
// }


// Print keypad combinations
// import java.util.*;
// public class recursion2 {
// // Keypad
// public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

// // function
// public static void printComb(String str, int index, String combination) {
//     // base case
//     if(index == str.length()) {
//         System.out.println(combination);
//         return;
//     }

//     // current char
//     char currChar = str.charAt(index);
//     String mapping = keypad[currChar- '0'];

//     for(int i=0; i<mapping.length(); i++) {
//         printComb(str, index+1, combination+mapping.charAt(i));
//     }
    

// }
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//     // Input string
//     System.out.print("Enter String of numbers: ");
//     String str = sc.next();

//     String combination = "";
//     int index = 0;

//     // function call
//     printComb(str, index, combination);
//     }

   
// }




