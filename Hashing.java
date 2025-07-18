import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args[]) {
        // Creation
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // Search - contains()
        if(set.contains(1)) {
            System.out.println("Element 1 is present");
        } else {
            System.out.println("Element 1 is not present");
        }

        if(set.contains(6)) {
            System.out.println("Element 6 is present");
        } else {
            System.out.println("Element 6 is not present");
        }

        // Delete - remove()
        set.remove(1);


        // Size- size()
        System.out.println("Size of set: " + set.size());

        // print elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}