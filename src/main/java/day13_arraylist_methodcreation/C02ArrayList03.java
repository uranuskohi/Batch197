package day13_arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02ArrayList03 {
    public static void main(String[] args) {


        //From a given list find all pairs whose sum is a given number
        //{4, 6, 5, -10, 8, 5, 20} ==> 10
        //For example;  4+6=10, 5+5=10, -10+20=10

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(-10);
        a.add(8);
        a.add(5);
        a.add(20);
        System.out.println(a);
        Collections.sort(a);

        for (int i=0; i<a.size(); i++){
            for (int k = i+1; k<a.size(); k++){
                if (a.get(i) + a.get(k)==10){
                    System.out.println(a.get(i) + " + " + a.get(k));
                }
            }
        }

        // Short format to create Arraylist
        // we can create arraylist by using Arrays.asList() method as short way. but if we create list like that
        // we can not use list methods which changes size of the list, like add(), remove(), clear().
        List<Integer> d = Arrays.asList(4,6,5,-10,6);
        System.out.println(d);
        System.out.println("d.get(1) = " + d.get(1));
        System.out.println("d.size() = " + d.size());

        // d.add(3);
        //d.remove(2);
        //d.clear();
        d.set(2,34);
        System.out.println(d);


    }
}
