// import java.util.*;
// public class bitManipulation {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
// // 1. Get Bit (means to print the bit available at that pos)
//         // bit mask=> 1<<i(pos)
//         // bit AND operation

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // input pos
//         System.out.print("Enter position u need to know:");
//         int pos = (sc.nextInt())-1;

//         // set bit mask
//         int mask = 1<<pos;

//         // get bit
//         if((mask & n) == 0 ) {
//             System.out.println("0");
//         } else {
//             System.out.println("1");
//         }

// // 2. Set bit (means to set the mentioned bit as 1)
//         // bit mask=> 1<<pos
//         // bit OR operation

//         // input pos
//         System.out.print("Enter postion to set: ");
//         int pos1 = (sc.nextInt())-1;

//         // set bit mask
//         int mask1 = 1<<pos1;

//         // set bit
//         int setBit = (mask1|n);
//         System.out.println(setBit);

// // 3. Clear bit (set the mentioned bit as 0)
//         // bit mask => ~(1<<i)
//         // bit AND operation

//         // input pos
//         System.out.print("Enter postion to clear: ");
//         int pos2 = (sc.nextInt())-1;

//         // set bit mask
//         int mask2 = ~(1<<pos2);

//         // clear bit
//         int clearBit = (mask2 & n);
//         System.out.println(clearBit);

// // 4. Update bit (Make 0 as 1 and 1 as 0)
//         // bit mask => 1<<i
//         // if we need to update to 1 use set operation
//         // if we need to update to 0 use clear operation

//         // input pos
//         System.out.print("Enter postion to update: ");
//         int pos3 = (sc.nextInt())-1;

//         // set bit mask (for 1)
//         int mask3 = 1<<pos3;

//         // set bit mask (for 0)
//         int mask4 = ~(1<<pos3);

//         // input updation
//         System.out.print("Enter updation(either 0 or 1): ");
//         int updation = (sc.nextInt());

//         // operation
//         int updateBit = 0;
//         if(updation == 0) {
//             updateBit = (mask4 & n);
//         }
//         else if(updation == 1) {
//             updateBit = (mask3 | n);
//         }
//         System.out.println(updateBit);
//     }
// }



//                                EXERCISE

// Q1. WRITE A PROGRAM TO FIND IF THE NUMBER IS POWER OF 2 OR NOT
// Logic: if we convert all numbers which are power of 2 it has only one 1 in their binary representation
// for example 2 = 10, 4 = 100, 8 = 100
// import java.util.*;
// public class bitManipulation {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // check if power of 2 or not
//         if((((n) & (n-1)) == 0) && (n!=0)) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }


// Q2. WRITE A PROGRAM TO TOGGLE A BIT A POSITION="POS", IN A GIVEN NUMBER N
// Logic: we can toggle a bit by using XOR operator
// import java.util.*;
// public class bitManipulation {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         // input pos
//         System.out.print("Enter position to toggle: ");
//         int pos = (sc.nextInt())-1;

//         // set bit mask
//         int mask = 1<<pos;

//         // toggle bit
//         int toggle = 0;
//         toggle = (n ^ mask);
//         System.out.println(toggle);
//         }
// } 


// Q3. WRITE A PROGRAM TO COUNT THE NUMBER OF 1'S IN BINARY REPRESENTATION OF A NUMBER
// import java.util.*;
// public class bitManipulation {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input n
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         int count  = 0;

//         // count number of 1's
//         while(n!=0) {
//             n = (n&(n-1));
//             count++;
//         }
//         System.out.println(count);
        
//     }
// }


// WRITE 2 FUNCTIONS DECIMALTOBINARY() AND BINARYTODECIMAL() TO CONVERT A NUMBER FROM ONE SYSTEM TO ANOTHER

