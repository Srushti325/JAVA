import java.util.ArrayList;
import java.util.Collections;
class AL {
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

        // get elements using .get() function, put index in the bracket
        int element = list.get(0);
        System.out.println(element);


        // to add element in between at some index
        list.add(1,1);   //here 1st parameter is the index and 2nd is the element to be entered
        System.out.println(list);


        // set element, meaning change the element currently present at an index
        list.set(0, 2);   // 1st is the position and 2nd is the new element
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // arrayList size using list.size;
        System.out.println(list.size());

        // loops
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // sorting, we can arrange an array list in ascending order using a simple function(no need to implement sort from scratch)
        Collections.sort(list);    //Collections is a clas in java which has a function called sort, we can use this collections ka sort function to sort all the data structures of the Collection framework, tho this function doesnt work on arrays
        System.out.println(list);
    }
}