// arrays
// import java.util.*;
// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();

//         int arr [] = new int [n];
//         System.out.println("Enter array elements: ");
//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("The array elements are:");
//         for(int i=0; i<arr.length; i++){
//             System.out.println("Element" + (i+1) + "=" + arr[i]);
//         }
//     }
// }

// Take an array of names as input from the user and print them on the screen.


// Find the common digit from the 3 entered numbers without using any built in functions
// import java.util.*;
// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = 12344;
//         int num2 = 54321;
//         int num3 = 56734;

//         int digit1[] = new int[10];
//         int digit2[] = new int[10];
//         int digit3[] = new int[10];

//         while(num1>0) {
//             int rem = num1 % 10;
//             digit1[rem] = 1;
//             num1 = num1/10;
//         }

//         while(num2>0) {
//             int rem = num2 % 10;
//             digit2[rem] = 1;
//             num2 = num2/10;
//         }

//         while(num3>0) {
//             int rem = num3 % 10;
//             digit3[rem] = 1;
//             num3 = num3/10;
//         }

//         System.out.print("The common digit(s) are: ");
//         for(int i=0; i<= 9; i++) {
//             if(digit1[i] == 1 && digit2[i] == 1 && digit3[i] == 1) {
//                 System.out.print(i);
//             }
//         }


//     }
// }


// Calculate the number of numbers which have 0 repeating digits in it
// import java.util.*;
// public class practiceNew{
//     public static boolean hasUniqueDigits(int num) {
//         boolean [] digits = new boolean [10];                      //for all 10 digits 0-9

//         while(num > 0) {
//             int rem = num % 10;
//             if(digits[rem]) {
//                 return false;
//             }
//             digits[rem] = true;
//             num = num/10;
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the upper limit:");
//         int num = sc.nextInt();

//         int count = 0;

//         for(int i=0; i<num; i++) {
//             if(hasUniqueDigits(i) == true) {
//                 count++;
//             }
//         }
//         System.out.println("The number of numbers with unique digits is: " + count);
//     }
// }



// Object- real world entity
// Class - blueprint or template for creating objects
// Object - instance of a class
// Instance- A sub part or the part we currently focus on
// Class variable - variable that belongs to the class (The value of it keeps on changing)
// Attribute - properties
// Method - functions
//  Member - part of a particular class

// Variables in terms of OOPs
// 1. Class Variables- variable that belongs to the class
// 2. Instance Variables- variable that belongs to the instance of the class
// 3. Local Variables- variable that belongs to the method
// 4. Static Variables- variable that belongs to the class and is shared by all instances

// Write a program to create a student class which is able to get student detail and print it inside the class and pass the values from the main and print it from the class. Also show how the constructor is initialized
// import java.util.*;
// class Student {
//     String name;
//     int age;
//     String branch;

//     public void printInfo() {
//         System.out.println("Student Information:");
//         System.out.println("Name: " + this.name);
//         System.out.println("Age: " + this.age);
//         if(this.age >= 18) {
//             System.out.println("Eligible for the course");
//         }
//         System.out.println("Branch: " + this.branch);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Student S1 = new Student();
//         System.out.print("Enter name: ");
//         S1.name = sc.next();
//         System.out.print("Enter age: ");
//         S1.age = sc.nextInt();
//         System.out.print("Enter branch: ");
//         S1.branch = sc.next();

//         S1.printInfo();
//     }
// }


// Implement multiple and hybrid inheritance using interfaces (HOMEWORK)


// Create a class with a method which prints a message- Hello Name
// import java.util.*;
// class Message {
//     String name;
//     public void printMessage() {
//         System.out.println("Hello " + this.name);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         Message M1 = new Message();
//         System.out.print("Enter Name: ");
//         M1.name = sc.nextLine();

//         M1.printMessage();
//     }
// }


// Create a class calculator with the methods- sum, difference
// import java.util.*;
// class Calculator {
//     int num1, num2;
//     public int sum() {
//         return this.num1+this.num2;
//     }

//     public int difference() {
//         return this.num1-this.num2;
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Calculator C1 = new Calculator();
//         System.out.print("Enter num1: ");
//         C1.num1 = sc.nextInt();
//         System.out.print("Enter num2: ");
//         C1.num2 = sc.nextInt();
//         System.out.print("The sum is: ");
//         System.out.println(C1.sum());
//         System.out.print("The difference is: ");
//         System.out.print(C1.difference());
//     }
// }


// OOPs
// class Pen {
//     String color;
//     String type;
//     String nameOfpen;

//     public void write() {
//         System.out.print("Write something");
//     }

//     public void printColor() {
//         System.out.print("Color of pen is: "+this.color);
//     }

//     public void printName() {
//         System.out.print("Name of pen is: "+this.nameOfpen);
//     }

//     // Pen() {
//     //     System.out.print("Constructor called!");
//     // }

//     Pen(String name) {
//         this.nameOfpen = nameOfpen;
//     }
// }
// public class practiceNew {
//     public static void main(String args[]) {
//         Pen pen1 = new Pen("Ball");
//         pen1.color = "Blue";
//         pen1.printColor();
//         pen1.printName();
//     }
// }


// class Student {
//     String name;
//     public void printName() {
//         System.out.print(this.name);
//     }

//     Student(String name) {
//         this.name = name;
//     }
// }
// public class practiceNew {
//     public static void main(String args[]) {
//         Student S1 = new Student("Srushti");
//         S1.printName();
//     }
// }

// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println("Name: " + this.name);
//         System.out.println("Age: " + this.age);
//     }

//     Student(Student S) {
//         this.name = S.name;
//         this.age = S.age;
//     }

//     Student() {

//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Student S1 = new Student();
//         S1.name = "Srushti";
//         S1.age = 21;

//         Student S2 = new Student(S1);
//         S2.printInfo();
//     }
// }


// Polymorphism
// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println("Name: " + this.name);
//     }

//     public void printInfo(int age) {
//         System.out.println("Age: " + this.age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Student S1 = new Student();

//         S1.name = "Srushti";
//         S1.age = 21;

//         S1.printInfo(S1.name, S1.age);
//     }
// }

// Inheritance
// class Shape {
//     String color;
// }
// class Triangle extends Shape {

// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Triangle T1  = new Triangle();
//         T1.color = "Red";

//         System.out.print("The color of triangle is: " + T1.color);
//     }
// }


// 1. Simple or single level inheritence
// class Shape {
//     public void printArea() {
//         System.out.println("Display Area:");
//     }
// }
// class Triangle extends Shape {
//     public void printArea(int l, int b, int h) {
//         System.out.println("Area of triangle: " + (l*b*h));
//     }
// }
// public class practiceNew {
//     public static void main(String args[]) {
//         Triangle T1 = new Triangle();
//         T1.printArea();
//         T1.printArea(3, 4, 5);
//     }
// }


// 2. Multi- level inheritence
// class Shape {
//     String name;
//     public void printShapeArea() {
//         System.out.println("Area of " + this.name + ":");
//     }
// }
// class Triangle extends Shape {
//     public void printArea(int l, int h, int b) {
//         System.out.println(l*h*0.5);
//     }
// }

// class RightTriangle extends Triangle {
//     public void printArea(int l, int h) {
//         System.out.println(l*h*0.5);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         RightTriangle T1 = new RightTriangle();
//         T1.name = "Right Triangle";
//         T1.printShapeArea();
//         T1.printArea(3, 4);
//     }
// }

// 3. Hierarchical inheritance
// class Shape {
//     String name;
//     public void printShapeArea() {
//         System.out.println("The area of " + this.name + ":");
//     }
// }
// class Triangle extends Shape {
//     public void printArea(int l, int h) {
//         System.out.println(l*h*0.5);
//     }
// }
// class Circle extends Shape {
//     public void printArea(int r) {
//         System.out.println(3.14*r*r);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Triangle T1 = new Triangle();
//         T1.name = "Triangle";
//         T1.printShapeArea();
//         T1.printArea(3, 4);

//         Circle C1 = new Circle();
//         C1.name = "Circle";
//         C1.printShapeArea();
//         C1.printArea(3);
//     }
// }

// Prime numbers
// import java.util.*;
// public class practiceNew {
//     public static void isPrime(int n) {

//         if(n<1) {
//             System.out.print("Enter valid number");
//         }
//         else if(n==1) {
//             System.out.print("Not Prime");
//         }
//         else if(n==2) {
//             System.out.print("Prime");
//         } else if(n>2) {
//             boolean result = false;
//             for(int i=2; i<n-1; i++) {
//                 if(n%i==0) {
//                     result = false;
//                     break;
//                 } else {
//                     result = true;
//                 }
//             }
//             if(result) {
//                 System.out.print("Prime");
//             } else {
//                 System.out.print("Not Prime");
//             }
//         }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         isPrime(n);
//     }
// }



// print factorial
// import java.util.*;
// public class practiceNew {
//     public static int printfact(int n) {
//         int fact = 1;
//         if(n == 0) {
//             return fact;
//         }
//         fact = n*printfact(n-1);
//         return fact;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter n: ");
//         int n = sc.nextInt();

//         System.out.println(printfact(n));
//     }
// }


// print fibonacci series
// import java.util.*;
// public class practiceNew {
//     public static int printfibo(int n) {
//         if(n==1 || n==0) {
//             return n;
//         } else {
//             return printfibo(n-1) + printfibo(n-2);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = sc.nextInt();

//         for(int i=0; i<n; i++) {
//             System.out.print(printfibo(i) + " ");
//         }
//     }
// }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input values
//         System.out.print("Enter total lines in first book: ");
//         int totalLinesFirstBook = sc.nextInt();

//         System.out.print("Enter read speed (lines/sec): ");
//         int readSpeed = sc.nextInt();

//         System.out.print("Enter write speed (lines/sec): ");
//         int writeSpeed = sc.nextInt();

//         System.out.print("Enter lines per page in second book: ");
//         int linesPerPageSecondBook = sc.nextInt();

//         System.out.print("Enter time in seconds: ");
//         int timeInSeconds = sc.nextInt();

//         // Step 1: Calculate total time required to read the first book
//         int totalReadTime = (int) Math.ceil((double) totalLinesFirstBook / readSpeed);

//         if (timeInSeconds < totalReadTime) {
//             // Bot is still reading
//             int linesRead = readSpeed * timeInSeconds;
//             System.out.println("Bot is Reading");
//             System.out.println("Lines Read: " + linesRead);
//         } else {
//             // Bot is writing
//             int timeSpentWriting = timeInSeconds - totalReadTime;
//             int linesWritten = writeSpeed * timeSpentWriting;

//             // Ensure we don’t write more than what we read
//             linesWritten = Math.min(linesWritten, totalLinesFirstBook);

//             int pagesWritten = linesWritten / linesPerPageSecondBook;
//             int linesOnCurrentPage = linesWritten % linesPerPageSecondBook;

//             System.out.println("Bot is Writing");
//             System.out.println("Pages Written: " + pagesWritten);
//             System.out.println("Lines on Current Page: " + linesOnCurrentPage);
//         }

//         sc.close();
//     }
// }

// import java.util.*;
// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of pages in book1:");
//         int pagesBook1 = sc.nextInt();

//         System.out.println("Enter number of lines on each page:");
//         int linesPerPageBook1 = sc.nextInt();

//         int totalLinesBook1 = (pagesBook1*linesPerPageBook1);

//         System.out.println("Enter reading speed from book1(lines/sec):");
//         int readSpeedBook1 = sc.nextInt();

//         System.out.println("Enter writing speed in book2(lines/sec):");
//         int writeSpeedBook2 = sc.nextInt();

//         System.out.println("Enter number of pages in book2: ");
//         int pagesBook2 = sc.nextInt();

//         System.out.println("Enter lines per page in book2: ");
//         int linesPerPageBook2 = sc.nextInt();

//         int totalLinesBook2 = (pagesBook2*linesPerPageBook2);

//         System.out.println("Enter time in seconds: ");
//         int timeInSeconds = sc.nextInt();

//         // total time ot read
//         int totalReadTime = (totalLinesBook1/readSpeedBook1);

//         // bot reading or writing
//         if(timeInSeconds < totalReadTime) {
//             System.out.println("Bot is Reading");
//             int readingLine = (timeInSeconds*readSpeedBook1);
//             System.out.println("Line reading: " + readingLine);
//         } else {
//             System.out.println("Bot is Writing");
//             int timeSpentWriting = (timeInSeconds - totalReadTime);
//             int linesWritten = (writeSpeedBook2*timeSpentWriting);
//             System.out.println("Lines Written: " + linesWritten);
//             System.out.println("Writing on line: " + linesWritten+1);
//         }
//     }
// }


// Check if the entered date is valid or not


// calculate the number of completed days in that year
// import java.util.*;
// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the year: ");
//         int year = sc.nextInt();

//         if(year%4 == 0) {
//             int numberOfDays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//             System.out.println("Enter the month number: ");
//             int month = sc.nextInt()-1;
//             System.out.println("Enter the day: ");
//             int days = sc.nextInt();

//             // calculate completed days
//             int completedDays = 0;
//             for(int i=0; i<month; i++) {
//                 completedDays = completedDays + numberOfDays[i];
//             }
//             System.out.println("Total completed days: " + (completedDays+days));
//         } else {
//             int numberOfDays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//             System.out.println("Enter the month number: ");
//             int month = sc.nextInt()-1;
//             System.out.println("Enter the day: ");
//             int day = sc.nextInt();

//             // calculate complete days
//             int completeDays = 0;
//             for(int i=0; i<month; i++) {
//                 completeDays = completeDays + numberOfDays[i];
//             }
//             System.out.println("Total completed days: " + (completeDays+day));
//         }
//     }
// }

// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println("Write something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }
// }


// public class practiceNew {
//     public static void main(String args[]) {

//         // Pen p1 = new Pen();

//         // p1.color = "Red";
//         // p1.type = "Gel";

//         // p1.printColor();
//         // p1.write();
//     }
// }

// import java.util.*;

// public class practiceNew {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         int result = replace0With5(num);
//         System.out.println("Modified number: " + result);
//     }

//     public static int replace0With5(int num) {
//         if (num == 0) return 5;

//         int result = 0;
//         int place = 1;

//         while (num > 0) {
//             int digit = num % 10;
//             if (digit == 0) digit = 5;
//             result += digit * place;
//             place *= 10;
//             num /= 10;
//         }

//         return result;
//     }
// }


// Student class
// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println("Name: " + this.name);
//         System.out.println("Age: " + this.age);
//     }

//     // copy constructor
//     Student(Student S) {    
//         this.name = S.name;
//         this.age = S.age;
//     }

//     // Normal Constructor
//     Student() {
//         System.out.println("Constructor called");
//     }

//     // parameterised Constructor
//     Student(String name) {
//         this.name = name;
//         System.out.println("Name: " + this.name);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "Srushti";
//         s1.age = 21;

//         Student s2 = new Student(s1);

//         s2.printInfo();



//         Student s3 = new Student("Shru");
//     }
// }



// Polymorphism
// Function overloading
// class Student {
//     String name;
//     int age;

//     // Function 1
//     public void printInfo(String name) {
//         System.out.println("Name: " + this.name);
//     }

//     // Function 2
//     public void printInfo(int age) {
//         System.out.println("Age: " + this.age);
//     }

//     // Function 3
//     public void printInfo(String name, int age) {
//         System.out.println("Name: " + this.name);
//         System.out.println("Age: " + this.age);
//     }
// }
// public class practiceNew {
//     public static void main(String args[]) {
//         Student s1 = new Student();

//         s1.name = "Srushti";
//         s1.age = 21;

//         // s1.printInfo(s1.age);
//         // s1.printInfo(s1.name);


//         // s1.printInfo("Srushti", 21);
//     }
// }


// class Shape {
//     String color;
// }
// class Triangle extends Shape {

//     public void printColor() {
//         System.out.println("color: " + this.color);
//     }
// }

// public class practiceNew {
//     public static void main(String args[]) {
//         Triangle t1 = new Triangle();
//         t1.color = "Red";

//         t1.printColor();

//     }
// }


// class Shape {
//     String color;
//     int size;
// }
// class Triangle extends Shape {
//     public void printColor() {
//         System.out.println("Color: " + this.color);

//     }
//     int b;
//     int h;
// }
// class EquilateralTriangle extends Triangle {
//     public void printArea(int b, int h) {
//         System.out.println("Area=" + (0.5*b*h));
//     }
//     public void printColor() {
//         System.out.println(this.color);
//     }
//     public void printSize() {
//         System.out.println("Size: " + this.size);
//     }
// }
// public class practiceNew {
//     public static void main(String args[]) {
//         Triangle t1 = new Triangle();
//         EquilateralTriangle e1 = new EquilateralTriangle();
//         t1.color = "Red";

//         t1.printColor();

//         t1.b = 12;
//         t1.h = 10;

//         e1.printArea(12, 10);
//         e1.color = "Black";
//         e1.printColor();
//         e1.size = 12;
//         e1.printSize();

//     }
// }

// import java.util.*;
// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         boolean box [] = new boolean [20];

//         System.out.println("Enter the box number in which chocolate is kept: ");
//         int n = sc.nextInt();

//         box[n-1] = true;

//         int guess = -1;
//         do {
//             System.out.println("Enter the guess: ");
//             guess = sc.nextInt();
//             if(guess >(n)) {
//                 System.out.println("HINT: Guess Lower");
//             }
//             else if(guess == n) {
//                 break;
//             }
//             else {
//                 System.out.println("HINT: Guess Higher");
//             }
//         } while(guess != (n));
//         if(guess == n) {
//             System.out.println("Correct guess");
//         }


//     }
// }


// check for valid parenthesis
// check if the 2 entered string are anagram


// import java.util.ArrayList;
// import java.util.Collections;
// public class practiceNew {
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // add elements
//         list.add(0);
//         list.add(2);
//         list.add(3);

//         System.out.println(list);


//         int element = list.get(0);
//         System.out.println(element);

//         list.add(1,1);
//         System.out.println(list);

//         list.set(0,5);
//         System.out.println(list);

//         list.remove(3);
//         System.out.println(list);

//         int size = list.size();
//         System.out.println(size);

//         for(int i=0; i<list.size(); i++) {
//             System.out.println(list.get(i));
//         }

//         Collections.sort(list);

//         System.out.println(list);
        
//     }
// }

// class practiceNew {

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void main(String args[]) {
//         practiceNew list = new practiceNew();

//     }
// }



// import java.util.*;
// public class practiceNew {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//         System.out.println("Enter k: ");
//         int k = sc.nextInt();

//         int count = k-1;

        
//     }
// }

// class Node {
//     int data;
//     Node left, right;

//     Node(int value) {
//         data = value;
//         left = right = null;
//     }
// }

// public class practiceNew {


//     Node root;

//     // Insert left child
//     public void insertLeft(Node parent, int value) {
//         parent.left = new Node(value);
//     }

//     // Insert right child
//     public void insertRight(Node parent, int value) {
//         parent.right = new Node(value);
//     }

//     // Inorder Traversal
//     public void inorder(Node node) {
//         if (node == null)
//             return;

//         inorder(node.left);
//         System.out.print(node.data + " ");
//         inorder(node.right);
//     }

//     public static void main(String[] args) {
//         practiceNew tree = new practiceNew();


//         tree.root = new Node(1);
//         tree.insertLeft(tree.root, 2);
//         tree.insertRight(tree.root, 3);
//         tree.insertLeft(tree.root.left, 4);
//         tree.insertRight(tree.root.left, 5);

//         System.out.println("Inorder Traversal:");
//         tree.inorder(tree.root);
//     }
// }


// Hashing
// import java.util.HashSet;
// import java.util.Iterator;
// public class practiceNew {
//     public static void main(String args[]) {
//         HashSet<Integer> set = new HashSet<>();
//         set.add(10);
//         set.add(20);
//         set.add(30);
//         set.add(40);
//         if(set.contains(30)) {
//             System.out.println("30 is present in the set");
//         } else {
//             System.out.println("30 is not present in the set");
//         }
//         Iterator it = set.iterator();
//         while(it.hasNext()) {
//             System.out.println(it.next());
//         }

//     }
// }


// HashMap:
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class practiceNew {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 130);
        map.put("USA", 30);
        map.put("UK", 60);

        System.out.println(map);

        map.put("UK", 30);
        System.out.println(map);

        if(map.containsKey("India")) {
            System.out.println("India is present in the map");
            System.out.println(map.get("India"));
        }

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + "->" + map.get(key));
        }
    }
}