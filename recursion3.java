// Print permutations of a string "abc"
// import java.util.*;
// public class recursion3 {
//     public static void printPermutation(String str, String permutation) {
//         if(str.length() == 0) {
//             System.out.println(permutation);
//             return;
//         }

//         for(int i=0; i<str.length(); i++) {
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             printPermutation(newStr, permutation+ currChar);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input string
//         System.out.print("Enter a small string: ");
//         String str = sc.next();

//         printPermutation(str, "");
//     }
// }


//  Count total paths in a maze to move from (0,0) to (n,m)
// import java.util.*;
// public class recursion3 {
//     public static int countPaths(int i, int j, int n, int m) {
//         if(i==n || j==m) {
//             return 0;
//         }

//         if(i==n-1 && j==m-1) {
//             return 1;
//         }

//         // move downwards
//         int downPaths = countPaths(i+1, j, n, m);

//         // move right
//         int rightPaths = countPaths(i, j+1, n, m);

//         return downPaths + rightPaths;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = 3, m = 3;

//         int totalPaths = countPaths(0, 0, n, m);
//         System.out.println("Total paths: " + totalPaths);
//     }
// } 

// place tiles of size 1Xm in a floor of size nXm
// import java.util.*;
// public class recursion3 {
//     public static int placeTiles(int n, int m) {
//         if(n == m) {
//             return 2;
//         }
//         if (n<m) {
//             return 1;
//         }
//         // vertically placing
//         int verticalPlaceing = placeTiles(n-m, m);

//         // horizontal placing
//         int horizontalPlacing = placeTiles(n-1, m);

//         return verticalPlaceing + horizontalPlacing;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = 4;
//         int m = 1;

//         System.out.println(placeTiles(n, m));
//     }
// }


// Find number of ways to invite n people to a party, single or in a pair
// import java.util.*;
// public class recursion3 {
//     public static int callGuests(int n) {
//         if(n <= 1) {
//             return 1;
//         }
        
//         // single
//         int ways1 = callGuests(n-1);

//         // in a pair
//         int ways2 = callGuests(n-2) * (n-1);

//         return ways1 + ways2;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = 4;
//         System.out.println(callGuests(n));
//     }
// }


// Print all the sub sets of a set of first n natural numbers
// import java.util.*;
// public class recursion3 {
//     public static void printSubsets(ArrayList<Integer> subset) {
//         for(int i=0; i<subset.size(); i++) {
//             System.out.print(subset.get(i) + " ");
//         }
//         System.out.println();
//     }
//     public static void findSubsets(int n, ArrayList<Integer> subset) {

//     if(n==0) {
//         printSubsets(subset);
//         return;
//     }
//     // Add
//     subset.add(n);
//     findSubsets(n-1, subset);

//     // Not adding
//     subset.remove(subset.size()-1);
//     findSubsets(n-1, subset);
// }
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//     int n = 3;
//     ArrayList<Integer> subset = new ArrayList<>();

//     findSubsets(n, subset);
// }
// }    
