import java.util.ArrayList;
class arrayList {
    public static void main(String args[]) {
        // Since only objects can be stored in arrayList we need to have a class 
        // so there are classes for each datatype:- Integer, String, Float, Boolean (Start with upper case)

        // define arrayList
        ArrayList<Integer> list = new ArrayList<>();   // or ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements:- use .add() method
        list.add(0);
        list.add(1);
        list.add(2);

        // print list
        System.out.println(list);
    }
}