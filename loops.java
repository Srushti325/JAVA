// // print 1 to n numbers
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n:");
//         int n = sc.nextInt();


//         // FOR LOOP
//         // for(int i=1; i<=n; i++){                   
//         //     System.out.println(i);
//         // }


//         //WHILE LOOP
//         // int i=1;
//         // while(i<=n){
//         //     System.out.println(i);
//         //     i++;
//         // }


//         // DO-WHILE LOOP
//         // int i=1;
//         // do {
//         //     System.out.println(i);
//         //     i++;
//         // } while (i<n);
        
//     }
// }


// // Sum of 1st n natural numbers
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=1; i<=n; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }


// // print table of a number input by the user
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();
//         int prod=1;
//         for(int i=1; i<=10; i++){
//             prod = n*i;
//             System.out.println(prod);
//         }
//     }
// }


//                                                      EXERCISE
// // Q1. Print all even numbers till n.
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         System.out.println("Even numbers till " + n + " are: ");
//         for(int i=1; i<=n; i++) {
//             if(i%2==0){
//                 System.out.println(i);
//             } 
//         }
//     }
// }


// Q2.  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//      If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//      If they enter 0 then stop.
//      If he/ she scores :
//      Marks >=90 -> print “This is Good”
//      89 >= Marks >= 60 -> print “This is also Good”
//      59 >= Marks >= 0 -> print “This is Good as well”
// 	    Because marks don’t matter but our effort does.
//      (Hint : use do-while loop but think & understand why)
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x;
//         do {
//             System.out.print("Enter marks:");
//             int mks = sc.nextInt();
//             if(mks>=90){
//                 System.out.println("This is good");
//             }
//             else if(mks>=60 && mks<=89) {
//                 System.out.println("This is also good");
//             }
//             else if(mks>=0 && mks<=59) {
//                 System.out.println("This is good as well");
//             }
//             System.out.println("Enter choice:\n1:enter marks\n0:exit");
//             x = sc.nextInt();
//         } while(x==1);
//     }
// }


//Q3. Print if a number is prime or not (Input n from the user). 
// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         int div = 2;
//         do{
//             if(n%div !=0) {
//                 div = div+1;
//                 isPrime = true;
//             }else {
//                 isPrime = false;
//                 break;
//             }
//         }while(div == (n-1));
//         if(isPrime == true){
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not Prime");
//         }

//     }
// }


// Q4. Print all prime numbers till n (n= user i/p)
// import java.util.*;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();   // Specify the maximum limit

//         System.out.println("Prime numbers from 1 to " + n + " are:");
//         for (int i = 2; i <= n; i++) { // Iterate from 2 to n
//             boolean isPrime = true; // Flag to check if number is prime
            
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) { // If i is divisible by j, it is not prime
//                     isPrime = false;
//                     break;
//                 }
//             }
            
//             if (isPrime) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


