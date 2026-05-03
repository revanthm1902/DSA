package STSII;

import java.util.HashMap;

public class hm {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.get(2)); // Output: two
        System.out.println(map.containsKey(3)); // Output: true
        System.out.println(map.containsValue("four")); // Output: false
        map.remove(1);
        System.out.println(map.get(1)); // Output: null
        System.out.println(map.size()); // Output: 2

        map.forEach((k,v)->System.out.println(k+"->"+v));
    }
}