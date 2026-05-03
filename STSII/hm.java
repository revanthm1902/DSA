package STSII;

import java.util.HashMap;

public class hm {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        // System.out.println(map.get(2)); // Output: two
        // System.out.println(map.containsKey(3)); // Output: true
        // System.out.println(map.containsValue("four")); // Output: false
        // map.remove(1);
        // System.out.println(map.get(1)); // Output: null
        // System.out.println(map.size()); // Output: 2

        // map.forEach((k,v)->System.out.println(k+"->"+v));

        // for(String s: map.values()){
        //     System.out.println(s);
        // }

        for(String s:map.keySet()){
            System.out.println(s+"->"+map.get(s));
        }

        if(map.containsKey("2")){
            System.out.println(map.get("2")!=null?"2(TWO)":"Not Found");
        }
    }
}