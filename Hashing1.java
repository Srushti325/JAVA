import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Hashing1 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        // Country, Population
        map.put("India", 130);
        map.put("China", 150);
        map.put("USA", 30);

        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);

        // Search Operation
        if(map.containsKey("China")) {
            System.out.println("China is present in the map");
        } else {
            System.out.println("China is not present in the map");
        }

        // get operation
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));


        // // New Iteration method
        // int arr [] = {12, 55, 93};

        // // Old for loop
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // // New For loop
        // for(int val : arr) {
        //     System.out.print(val + " ");
        // }


        // Iteration for HashMap
        for(Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Other way
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // remove
        map.remove("China");
        System.out.println(map);
    }
}