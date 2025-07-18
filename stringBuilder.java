// import java.util.*;
// public class stringBuilder {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // String Builder declaration
//         StringBuilder sb = new StringBuilder("Tony");

//         // print string builder
//         System.out.println(sb);

//         // print character at index 0
//         System.out.println(sb.charAt(0));

//         // set char at index
//         sb.setCharAt(0,'P');
//         System.out.println(sb);

//         // insert char at
//         sb.insert(0,'P');
//         System.out.println(sb);

//         // delete deletes a substring 
//         sb.delete(0,1);        //end non-inclusive
//         System.out.println(sb);     
        
//         // append adds char or string at the end
//         sb.append("abc def");
//         System.out.println(sb);

//         // length  calculates length of the string
//         System.out.println(sb.length());
//     }
// }


//                                           EXERCISE
// Q1. REVERSE A STRING 
// import java.util.*;
// public class stringBuilder {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input string
//         System.out.println("Enter a string: ");
//         String str = sc.nextLine();

//         // declare a string builder
//         StringBuilder sb = new StringBuilder(str);

//         // reverse a string
//         for(int i=0; i<(sb.length()/2); i++) {
//             // pointers
//             int front = i;
//             int back = sb.length()-1-i;

//             // char
//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             // swap
//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }

//         // print string
//         System.out.println("Reverse is:  " + sb);


//     }
// }
