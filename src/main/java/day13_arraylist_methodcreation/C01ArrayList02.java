package day13_arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C01ArrayList02 {
    public static void main(String[] args) {

        // Example:  Create a character list which has repeated chars and remove duplicates
        // [j, a ,v, c] ----> [j,a,v,c]
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');
        System.out.println(a);

        for (Character w :a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);



        //Example 4: Find the closest 2 integers in the given list.
        ////           [20, 15, 14, 11, 19] ==> 14-15, 19-20
        ArrayList<Integer> c = new ArrayList<>();
        c.add(20);
        c.add(15);
        c.add(14);
        c.add(11);
        c.add(19);
        System.out.println(c); // [20, 15, 14, 11, 19]

        // first step: sort the Arraylist
        Collections.sort(c);
        System.out.println(c);

        // Second step: find the difference and the minDifference
        int minDiff = c.get(1)- c.get(0);
        for (int i = 1; i< c.size() ; i++){
            if (c.get(i) - c.get(i-1)<minDiff){
                minDiff= c.get(i)- c.get(i-1);
            }
        }
        System.out.println(minDiff);

        // last step: find element that they have minDiff among them
        for (int k = 1; k< c.size() ; k++){
            if (c.get(k) - c.get(k-1)==minDiff){
                System.out.println(c.get(k-1) + " and " + c.get(k));
            }
        }

    }
}
