// Print numbers 5 to 1
// import java.util.*;
// public class recursion1 {
//     public static void printNumb(int n) {
//         if(n==0) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // call function
//         printNumb(n);

//     }
// }


// Print numbers from 1 to 5
// import java.util.*;
// public class recursion1 {
//     public static void printNumb(int n, int i) {
//         if(i > n) {
//             return;
//         }
//         System.out.println(i);
//         // i++;
//         printNumb(n,i+1);
        
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // counter that prints
//         int i = 1;

//         // call function
//         printNumb(n,i);

//     }
// }


// Print sum of first n natural numbers
// import java.util.*;
// public class recursion1 {
//     public static void printSum(int i, int n, int sum) {
//         if(i>n) {
//             System.out.println(sum);
//             return;
//         }
//         sum = sum + i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // sum
//         int sum = 0;

//         // counter that increases
//         int i = 0;

//         printSum(i, n, sum);
//     }
// }


// Print factorial of a number n
// import java.util.*;
// public class recursion1 {
//     public static void printFact(int n, int fact) {

//         // Method 1
//         if(n<1) {
//             System.out.println(fact);
//             return;
//         }
//         fact = fact*n;
//         printFact(n-1, fact);

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // fact
//         int fact = 1;

//         // call function
//         printFact(n, fact);
//     }
// }

// Print fibonacci series till nth term
// import java.util.*;
// public class recursion1 {
//     public static int printFibo(int n) {
//         if(n==1 || n==0) {
//             return n;
//         } else {
//             return printFibo(n-1) + printFibo(n-2);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // function call
//         for(int i=0; i<n; i++) {
//             System.out.print(printFibo(i) + " ");
//         }
//     }
// }

// Print x^n (height of stack = n)
// import java.util.*;
// public class recursion1 {
//     public static int power(int x, int n) {
//         if(n == 0 || x == 1) {
//             return 1;
//         }
//         int xPowNm1 = power(x,(n-1));
//         int xPowN = x*(xPowNm1);
//         return xPowN;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input x
//         System.out.print("Enter x: ");
//         int x = sc.nextInt();

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // function call
//         System.out.println(power(x,n));
//     }
// }


// Print x^n (height of stack = log(n))
// import java.util.*;
// public class recursion1 {
//     public static int power(int x, int n) {
//         if(n == 0 || x == 1) {
//             return 1;
//     }
//     if(n % 2 == 0) {
//         return power(x,n/2)*power(x, n/2);
//     } else {
//         return x*power(x, n/2)*power(x, n/2);
//     }
// }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input x
//         System.out.print("Enter x: ");
//         int x = sc.nextInt();

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // call function
//         System.out.println(power(x, n));
//     }
// }

