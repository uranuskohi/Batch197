package day13_arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;

public class practice02 {
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
        Collections.sort(a);
        for (int i = 0; i<a.size(); i++){
            for (int k = i+1; k<a.size(); k++){
                if (a.get(i) + a.get(k) == 10){
                    System.out.println(a.get(i) + " + " + a.get(k));
                }
            }
        }



















    }
}
