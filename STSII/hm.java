package STSII;

import java.util.HashMap;
import java.util.Map;

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

        if(map.containsValue("on")){
            System.out.println("one is present in the map");
        }else{
            System.out.println("one is not present in the map");
        }

        map.remove("1");
        System.out.println(map);
        map.remove("two","three");
        System.out.println(map);

        map.forEach((k,v)->System.out.println(k+"->"+v));

        for(Map.Entry<String, String> e: map.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }

        for(String key: map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }

        for(String value: map.values()){
            System.out.println(value);
        }
    }
}