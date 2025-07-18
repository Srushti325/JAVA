// Check eligibility to vote using if-else
// import java.util.*;
// public class conditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter age:");
//         int age = sc.nextInt();
//         if(age >= 18){
//             System.out.print("you can vote");
//         }else {
//             System.out.println("Cant vote");
//         }
//     }
// }

// // Check if the given number is odd or even
// import java.util.*;
// public class conditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n = sc.nextInt();

//         if(n%2==0){
//             System.out.println("Even");
//         }else {
//             System.out.println("odd");
//         }
//     }
// }

// // compare numbers a and b
// import java.util.*;
// public class conditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter b: ");
//         int b = sc.nextInt();

//         if(a == b){
//             System.out.println("Equal");
//         }
//         else if(a<b) {
//             System.out.println("a is smaller");
//         } else {
//             System.out.println("a is greater");
//         }
//     }
// }

// // Different greetings using switch case
// import java.util.*;
// public class conditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new  Scanner(System.in);
//         System.out.println("Enter\n1-Hindi\n2-English\n3-Spanish");
//         int n = sc.nextInt();
//         switch(n){
//             case 1: System.out.println("Namaste");
//             break;
//             case 2: System.out.println("Hello");
//             break;
//             case 3: System.out.println("Hola");
//             break;
//             default: System.out.println("Invalid number");
//         }
//     }
// }




//                                                        HOMEWORK
// Q1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//    1 : + (Addition) a + b
//    2 : - (Subtraction) a - b
//    3 : * (Multiplication) a * b
//    4 : / (Division) a / b
//    5 : % (Modulo or remainder) a % b
//    Calculate the result according to the operation given and display it to the user.
// import java.util.*;
// public class conditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter b: ");
//         int b = sc.nextInt();

//         System.out.println("Enter:\n1:addition(a+b)\n2:subtraction(a-b)\n3:Multiplication(a*b)\n4:division(a/b)\n5:Modulo or remainder(a%b): ");
//         int x = sc.nextInt();

//         switch(x){
//             case 1: System.out.println(a + "+" + b + "=" + (a+b));
//             break;
//             case 2: System.out.println(a + "-" + b + "=" + (a-b));
//             break;
//             case 3: System.out.println(a + "*" + b + "=" + (a*b));
//             break;
//             case 4: System.out.println(a + "/" + b + "=" + (a/b));
//             break;
//             case 5: System.out.println(a + "%" + b + "=" + (a%b));
//             break;
//             default: System.out.println("Enter valid choice");     
//            }
//     }
// }


// Q2. Ask the user to enter the number of the month & print the name of the month. 
//     For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
// import java.util.*;
// public class conditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n = sc.nextInt();

//         switch(n) {
//             case 1: System.out.println("january");
//             break;
//             case 2: System.out.println("february");
//             break;
//             case 3: System.out.println("march");
//             break;
//             case 4: System.out.println("april");
//             break;
//             case 5: System.out.println("may");
//             break;
//             case 6: System.out.println("june");
//             break;
//             case 7: System.out.println("july");
//             break;
//             case 8: System.out.println("august");
//             break;
//             case 9: System.out.println("september");
//             break;
//             case 10: System.out.println("october");
//             break;
//             case 11: System.out.println("november");
//             break;
//             case 12: System.out.println("december");
//             break;
//             default: System.out.println("Enter valid number");
//         }
//     }
// }

    
