package STSII;

import java.util.*;
public class tm {
    public static void main(String[] args) {
        Map<Integer, String> h = new HashMap<>();
        h.put(3,"three");
        h.put(1,"one");
        h.put(2,"two");
        System.out.println(h);

        TreeMap<Integer,String> t= new TreeMap<>(h);

        System.out.println(t);
        
        for(Map.Entry<Integer,String> e: t.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
    }
}
