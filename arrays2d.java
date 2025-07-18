// Q1. CREATE A 2D ARRAY AND DISPLAY IT ON THE SCREEN IN THE FORM OF MATRIX REPRESENTATION
// import java.util.*;
// public class arrays2d {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
//         // input rows and columns
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         // declare array
//         int arr [][] = new int [rows][cols];

//         // input array elements
//         System.out.println("Enter matrix elements: ");
//         for(int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // display array in the form of matrix
//         System.out.println("The matrix is: ");
//         for(int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }


//     }
// }


// Q2. TAKE A 2D ARRAY AS INPUT FROM THE USER AND FIND A GIVEN ELEMENT X FROM THE ARRAY. IF FOUND PRINT ITS INDICES AND POSITION.
// import java.util.*;
// public class arrays2d {
//     public static boolean findElement(int arr[][], int x, int rows, int cols) {

//         //search element and print index if element found 
//         for(int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 if(arr[i][j]==x) {
//                     System.out.println("Element found at index: " + i + " " + j);
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // input array rows and columns
//         System.out.print("Enter rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter columns: ");
//         int cols = sc.nextInt();

//         // declare array
//         int arr [][] = new int[rows][cols];

//         //input array elements
//         System.out.println("Enter array elements: ");
//         for(int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         //display array in matrix form
//         System.out.println("The matrix is: ");
//         for(int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // enter element to be found
//         System.out.print("Enter element to be found: ");
//         int x = sc.nextInt();

//         //call function to find element X in the array
//         boolean searchElement = findElement(arr, x, rows, cols);

//         // if element not found
//         if(searchElement == false) {
//             System.out.println("Element not found");
//         }
//     }
// }


//                                                    EXERCISE
//Q1. PRINT SPIRAL MATRIX FOR THE FOR THE GIVEN MATRIX BY THE USER
//Q2. PRINT THE MATRIX IN DIAGONAL ORDER
//Q3. PRINT THE MATRIX IN ZIGZAG ORDER
//Q4. PRINT THE MATRIX IN CLOCKWISE ORDER
//Q5. PRINT THE MATRIX IN ANTICLOCKWISE ORDER

