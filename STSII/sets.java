package STSII;

import java.util.*;
// public class sets {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Set<String> s=new HashSet<>();
//         String str=sc.nextLine();
//         String[] arr=str.split(" ");
//         for(String a: arr){
//             s.add(a);
//         }
//         System.out.println(s);
//     }
// }

// public class sets{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Set<String> s=new LinkedHashSet<>();
//         String str=sc.nextLine();
//         String[] arr=str.split(" ");
//         for(String a: arr){
//             s.add(a);
//         }
//         System.out.println(s);
//     }
// }

public class sets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<String> s=new TreeSet<>();
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(String a: arr){
            s.add(a);
        }
        System.out.println(s);
    }
}