// // Q1. Make a fun. to add two numbers and return the sum.
// import java.util.*;
// public class functions {
//     public static int printSum(int a, int b) {
//         System.out.print("The sum of " + a + " and " + b + " is " + (a+b));
//         return 0;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter b: ");
//         int b = sc.nextInt();

//         printSum(a,b);

//     }
// }



// // Q2. Multiply 2 numbers and return the product
// import java.util.*;
// public class functions{
//     public static void printProd(int a, int b) {
//         System.out.println("The product of " + a + " and " + b + " is " + (a*b));
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a: ");
//         int a  = sc.nextInt();
//         System.out.println("Enter b: ");
//         int b = sc.nextInt();
//         printProd(a,b);
//     }
// }


// // Q3. Find factorial of a number
// import java.util.*;
// public class functions {
//     public static void printFact(int n) {
//         int fact = 1;
//         for(int i=n; i>=1; i--) {
//             fact = fact*i;
//         }
//         System.out.print("Factorial of " + n + " is " + fact);
//         return;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         printFact(n);

//     }
// }


//                              EXERCISE
// Q1.MAKE A FUNCTION TO CHECK IF THE ENTERED NUMBER IS PRIME OR NOT
// import java.util.*;
// public class functions {
//     public static void checkPrime(int n) {
//         boolean prime = true;
//         int div = 2;
//         if(n == 2) {
//             prime = true;
//         }else {
//             do {
//                 if(n%div !=0){
//                     div = div+1;
//                 }
//                 else {
//                     prime = false;
//                     break;
//                 }
//             }while (div == (n-1));
//         }

//         System.out.print(prime);


//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         checkPrime(n);

//     }
// }


// Q2. CHECK IF THE GIVEN NUMBER IS EVEN OR NOT
// import java.util.*;
// public class functions {
//     public static void isEven(int n) {
//         if(n%2 == 0 ) {
//             System.out.println("EVEN");
//         }else {
//             System.out.println("NOT EVEN");
//         }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         isEven(n);

//     }
// }


// Q3. MAKE A FUNCTION TO PRINT THE TABLE OF A GIVEN NUMBER N.
// import java.util.*;
// public class functions {
//     public static void table(int n) {
//         for(int i=1; i<=10; i++) {
//             System.out.println(n + " X " + i + " = " + (n*i));
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         table(n);
//     }
// }


