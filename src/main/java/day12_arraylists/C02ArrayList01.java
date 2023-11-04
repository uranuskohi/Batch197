package day12_arraylists;

import java.util.ArrayList;

public class C02ArrayList01 {
    public static void main(String[] args) {

        // Array List is used to store multiple data with flexible length
        // We have to declare length when we create arrays. This causes problems in some occasions.
        // Java created a new structure to overcome this problem --> Arrays list.
        // Arrays store primitive data and references but array list store non-primitive data
        // Why java did not remove arrays because arrays are faster, they use memory less.

        // How to create Array List:
        ArrayList<Integer> myList = new ArrayList<>();

        // How to print Array List on the console:
        System.out.println(myList);
        // How to add elements to array list:
        myList.add(6);
        myList.add(3);
        myList.add(9);    // add() methods adds elements to the end of the list

        myList.add(1,5);
        myList.add(3,7);


        ArrayList<Integer> n = new ArrayList<>();
        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);

        myList.addAll(2,n);
        myList.addAll(n);

        // How to remove elements:

        myList.remove(2);
        myList.remove(myList.get(2));

        // How to get index of an element:
        System.out.println("myList.indexOf(88) = " + myList.indexOf(88));
        // Returns the index of the first occurrence of the specified element in this list,
        // or -1 if this list does not contain the element


        // How to update an element:
        myList.set(1,15);

        // How to get an element:
        System.out.println("myList.get(2) = " + myList.get(2));
        System.out.println(myList);

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


        // Example 2: Create a String ArrayList and remove elements that contains "a"
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Madrid");
        cities.add("Galicia");
        cities.add("Andalucia");
        System.out.println(cities);
        for (int i =0 ; i< cities.size(); i++){
            if (cities.get(i).contains("a")){
                cities.remove(cities.get(i));
                i--;
            }
        }
        System.out.println(cities);

    }
}
