// class Pen {
//     String color;
//     String type; // ball, gel

//     public void write() {
//         System.out.println("Writing something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

//     public void printType() {
//         System.out.println(this.type);
//     }
// }

// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);

//     }
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }

// public class OOPS {
//     public static void main(String args[]) {
//         // Pen pen1 = new Pen();
//         // pen1.color = "Blue";
//         // pen1.type = "gel";

//         // Pen pen2 = new Pen();
//         // pen2.color = "Black";
//         // pen2.type = "ball";

//         // pen1.printColor();
//         // pen2.printColor();

//         Student s1 = new Student("anam", 24);
//         s1.printInfo(); 
//     }
// }



// class Student {
//     String name;
//     int age;

//     public void printInfo(String name) {
//         System.out.println(name);
//     }

//     public void printInfo(int age) {
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age) {
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "Srushti";
//         s1.age = 23;
//         s1.printInfo(s1.name);
//         s1.printInfo(s1.age);
//         s1.printInfo(s1.name, s1.age);
//     }
// }

// class Shape {
//     String color;
// }

// class Triangle extends Shape {

// }

// public class OOPS {
//     public static void main(String args[]) {
//         Triangle t1 = new Triangle();
//         t1.color = "Red";
//     }
// }


// class Shape {
//     public void area() {
//         System.out.println("Display area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h) {
//         System.out.println("Area of Triangle is " + (l * h) / 2);
//     }
// }

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println("Area of Triangle is " + (l * h) / 2);
//     }
// }

// public class OOPS {
//     public static void main(String args[]) {

//     }
// }



// abstract class Animal {                             //Whenever we make horse or chicken we dont need to know whats there in animal class because ultimately all the properties of animal class are coming under horse and chicken class therefore we can make it abstract, the user doesnt need to know about the animal class
//     // public void walk() {                         // animal class becomes irrelevant
//     // }                                            // Also we can make the functions present in the abstract class also abstract 
//     Animal() {
//         System.out.println("You are an animal");
//     }
//     abstract void walk();                           //Now the walk() present in the animal class does nothing, it can be made abstract like---- no need to write its implementation
//     public void eats() {
//         System.out.println("Animal eats");
//     }
// }                                                  
// class Horse extends Animal {
//     Horse() {
//         System.out.println("You are creating a horse");
//     }
//     public void walk() {
//         System.out.println("Walks on 4 legs");
//     }
// }
// public class OOPS {
//     public static void main(String args[]) {
//         Horse h1 = new Horse();
//         // h1.walk();
//         // Animal a1 = new Animal();          //No red line....but causes a runtime error saying cannot be instantiated...means cant be initiated since it is an abstract class 
//         // a1.walk();
//         // h1.eats();
//     }
// }


// // Interfacing
// interface Animal {
//     int eyes = 2;       // fixed no. Same for all animals (Static), final and Public(Accessible to all)
//     public void walk();    // even if we dont write public here its fine coz methods and attributes are by default public and abstract in interfaces
//     // Animal() {
//                                             //    Constructor not possible in interface
//     // }

//     // void eat() {
//                                            //   Non Abstract methods are not allowed
//     // }

// }

// interface Herbivore {

// }

// class Horse implements Animal, Herbivore {
//     public void walk() {                     //imp to write public 
//         System.out.println("Walks on 4 legs");
//     }
// }
// public class OOPS {
//     public static void main(String args[]) {
//         Horse h1 = new Horse();
//         h1.walk();
//     }      
// }

class Student {
    String name;
    static String school;     // school name is same for all students therefore made static :- made same for all
    public static void changeSchool() {
        school = "newSchool";
    }
}

public class OOPS {
    public static void main(String args[]) {
        Student.school = "Sinhgad Springdale";       // no need to create an object to access static variable, they can be accessed using class name (school name= common)
        Student s1 = new Student();
        s1.name = "Rahul";                             // need to create object for private things like name/ variable things like name 
        System.out.println(s1.school);
    }

}


// Static can be used in 4 types- 
// 1. use it as a prefix for properties
// 2. use it as prefix for functions
// 3.            infront of a block
// 4. in front of nested classes

// Static attributes are given memory only once
// so to save memory we can declare common information only once 

