// Questions
// Given an integer array of size n, find all elements that appear more than n/3 times
// import java.util.*;
// public class InplementHashing {
//     public static void majorityElement(int num[]) {

//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = num.length;

//         for(int i=0; i<n; i++) {
//             if(map.containsKey(num[i])) {
//                 map.put(num[i], map.get(num[i]) + 1);
//             } else {
//                 map.put(num[i], 1);
//             }
//         }

//         for(int key : map.keySet()) {
//             if(map.get(key) > n/3) {
//                 System.out.println(key);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {1, 2};
//         majorityElement(num);
//     }
// }



// Union  and Intersection of 2 arrays
// import java.util.HashSet;
// public class ImplementHashing {
//     public static int union(int arr1[], int arr2[]) {
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         return set.size();
//     }

//     public static int intersection(int arr1[], int arr2[]) {
//         HashSet<Integer> set = new HashSet<>();
//         int count = 0;
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }
//         for(int i=0; i<arr2.length; i++) {
//             if(set.contains(arr2[i])) {
//                 System.out.println(arr2[i] + " ");
//                 count++;
//                 set.remove(arr1[i]);
//             }
//         }
//         System.out.println(count);
//         return 0;
//     }

//     public static void main(String args[]) {
//         int arr1 [] = {7, 3, 9};
//         int arr2 [] = {6, 3, 9, 2, 9, 4};

//         System.out.println(union(arr1, arr2));

//         intersection(arr1, arr2);
//     }
// }



