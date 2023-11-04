package day12_arraylists;

import java.util.ArrayList;

public class Practice02 {
    public static void main(String[] args) {

        //Example 2: Print the elements which has "a" in it from a multidimensional array
        String [][] brr = {{"Java", "is"},{"easy"},{"to","learn"}};
        for (String [] w: brr){
            for (String u: w){
                if (u.contains("a")){
                    System.out.print(u + " ");
                }
            }
        }

        System.out.println();
        // Example 2: Type code to find the maximum and minimum element in a 2-dimensional integer array
        int[][] n = { {5, 2}, {14, 9}, {-7} };
        int maximum = n[0][0];
        int minimum = n[0][0];
        for (int [] w: n){
            for (int d:w){
                maximum = Math.max(maximum,d);
                minimum = Math.min(minimum,d);
            }
        }
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);



        /////////////////////////////////////////////////////
        // Example: Create an array list and change odd elements to 11
        ArrayList<Integer> m = new ArrayList<>();
        m.add(23);
        m.add(20);
        m.add(13);
        m.add(8);
        m.add(3);
        System.out.println(m);

        for (Integer w: m){
            if (w %2 !=0){
                m.set(m.indexOf(w),11);
            }
        }
        System.out.println(m);


////////////////////////////////////////////////////////////////////////
        ArrayList<String> s = new ArrayList<>();
        s.add("Madrid");
        s.add("Barcelona");
        s.add("Galicia");
        s.add("New York");
        for (String w: s){
            if (w.contains("a")){
                s.remove(w);
            }
        }
        System.out.println();



















    }
}
