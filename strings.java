// import java.util.*;
// public class strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // String declaration
//         String name = "Tony";
//         String fullName = " Tony Stark";
//         String sentence = "My name is Tony Stark";

//         // String input
//         System.out.println("Enter name: ");
//         String nameInput = sc.nextLine();
//         System.out.println("Enter full name: " + nameInput);

//                                                         // String manipulation
//     // 1. Concatenation
//     String n1 = "Tony ";
//     String n2 = "Stark";
//     System.out.println("concatenation" + (n1+n2));

//     // 2. Length
//     System.out.println("length: " + n1.length());

//     // 3. CharAt()
//     for(int i=0; i<n2.length(); i++) {
//         System.out.println(n2.charAt(i));
//     }
//     // 4. CompareTo()
//         // a. s1=s2 : 0
//         // b. s1>s2 : 1
//         // c. s1<s2 : -1
//     if(n1.compareTo(n2)==0) {
//         System.out.println("Equal");
//     } else if(n1.compareTo(n2)>0) {
//         System.out.println("n1>n2");
//     } else if(n1.compareTo(n2)<0) {
//         System.out.println("n1<n2");
//     }

//     // 5. SubString
//     String n3 = "Srushti Kulkarni";
//     System.out.println("Substring: " + n3.substring(0,8));
//     }

//     // 6. ParseInt method
//     String n4 = "123";
//     int num = Integer.parseInt(n4);

//     // 7. ToString method
//     int num1 = 123;
//     String n5 = Integer.toString(num1);
// }

                                                          // EXERCISE
// Q1. TAKE AN ARRAY OF STRINGS AND FIND THE CUMULATIVE LENGTH OF THOSE STRINGS
// import java.util.*;
// public class strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Number of strings to enter: ");
//         int n = sc.nextInt();
//         String arr [] = new String[n];

//         // input strings
//         for(int i=0; i<n; i++) {
//             System.out.print("Enter string " + (i+1) + ": ");
//             arr[i] = sc.next();
//         }

//         // display all input strings
//         for(int i=0; i<n; i++) {
//             System.out.println("String " + (i+1) + ": ");
//             System.out.println(arr[i]);
//         }

//         // concatenate all strings
//         String sum = "";
//         for(int i=0; i<n; i++) {
//             sum = sum + arr[i];
//         }

//         // length of concatenated string
//         System.out.println("The length of concatenated string is: " + sum.length());
//     }
// }

// Q2. TAKE A STRING AS INPUT FORM THE USER AND CREATE A NEW STRING CALLED "RESULT" WHICH REPLACES 'E' WITH 'R' FROM THE ORIGINAL STRING INPUT
// import java.util.*;
// public class strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input a string: ");
//         String str = sc.nextLine();
//         String result = "";

//         // creating result
//         for(int i=0; i<str.length(); i++) {
//             if(str.charAt(i) == 'e') {
//                 result = result + 'i';
//             } else {
//                 result = result + str.charAt(i);
//             }
//         }

//         // printing result
//         System.out.println(result);
//     }
// }


// Q3. INPUT AN EMAIL ADDRESS FROM THE USER AND CREATE AN USER NAME BY DELETING THE PART THAT COMES AFTER '@'. FURTHER PRINT THE USER NAME.
// import java.util.*;
// public class strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input email id
//         System.out.print("Enter e-mail ID: ");
//         String email = sc.next();

//         // username
//         String username = "";
//         int index=0;
//         for(int i=0; i<email.length(); i++) {
//             if(email.charAt(i) == '@') {
//                 index = i;
//             }
//         }
//         username = email.substring(0, index);
//         System.out.println("Username: " + username);
//     }
// }

