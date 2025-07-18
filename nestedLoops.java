//Print: *****
//       *****
//       *****
//       *****
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
            
//             for(int j=1; j<=n+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Print: *****
//        *   *
//        *   *
//        *   *
//        *****
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n; j++) {
//                 if(i==1 || j==1 || i==n || j==n) {
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Print: *
//        **
//        ***
//        ****
//        *****
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
      

// Print *****
//       ****
//       ***
//       **  
//       *  
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         for(int i=n; i>=1; i--) {
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Print:     * 
//           ** 
//          *** 
//         ****
//        *****
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++) {
//             for(int k=n; k>=i; k--){            //spaces
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");        //stars
//             }
//             System.out.println();               //nextLine
//         }
//     }
// }



// Print: 1 
//        12
//        123 
//        1234
//        12345
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// Print: 12345
//        1234
//        123
//        12
//        1
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n=sc.nextInt();
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// Print: 1 
//        2 3
//        4 5 6
//        7 8 9 10
// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         int counter =1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(counter + "  ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
// }





// // import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=0; j<=n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter length:");
//         int l= sc.nextInt();
//         System.out.print("Enter breadth:");
//         int b= sc.nextInt();

//         for(int i=1; i<=l; i++) {
//             for(int j=1; j<=b; j++) {
//                 if(i==1 || i==l || j==1 || j==b) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// public class nestedLoops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         for(int i=0; i<n; i++) {
//             for(int j=0; j<i+1; j++) {
//                 if((i+j)%2==0) {
//                     System.out.print(1);
//                 } else {
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


