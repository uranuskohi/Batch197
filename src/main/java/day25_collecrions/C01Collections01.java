package day25_collecrions;

import java.util.ArrayList;
import java.util.LinkedList;

/*
            ArrayList good for searching purposes
            Link list good for adding and removing purposes

            1: ArrayLists and LinkedLists are child classes of List Interface
            2: ArrayLists are successful in searching operations, but LinkedLists are not
               successful in searching operations
            3: LinkedLists are successful in adding and removing operations, but ArrayLists are not
               successful in adding and removing operations
            4: LinkedLists have "notes" not "elements"
                "Nodes" have two parts: 1: data  2: pointers
                 First node is pointed by (Head) and last node (tail) points null
     */
public class C01Collections01 {
    /*
        1) ArrayLists and LinkedLists are child classes of List Interface
        2) ArrayLists are successful in search operations , but
           LinkedLists are not successful in search operations
       3)  LinkedLists are successful in adding and removing operations, but
            ArrayLists are not successful in those operations.
       4)  LinkedLists have "node"s  not "elements"
            "Nodes" have two parts: i) data  ii) pointer(address)
            First node is pointed by "head" and "last node" (tail) points null.
     */
    public static void main(String[] args) {
        ArrayList<Integer> listArr = new ArrayList<>();
        LinkedList<Integer> myList = new LinkedList<>();

        myList.add(5); // [5, , ]
        myList.add(1,8);// [5,8]
        myList.add(2,12); // [5,8,12]
        myList.addLast(7);
        System.out.println(myList); // [5,8,12,7]

        myList.remove((Integer) 12);
        System.out.println(myList); // [5, 8, 7]
        System.out.println(myList.remove());  // 5 ---->  Retrieves and removes the head (first element) of this list.  " Cut-Paste"
        System.out.println(myList); // [8,7]

        int removedNode = myList.removeFirst();  // Removes and returns the first element from this list. " Cut-Paste"
        System.out.println("removedNode = " + removedNode);

        myList.add(34);
        myList.add(3);
        myList.add(4);
        myList.add(8);

        System.out.println("myList = " + myList); // [7, 34, 3, 4, 8]
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(8);
        list2.add(31);
        list2.add(34); // [8,31,34]

        myList.removeAll(list2);
        System.out.println(myList);

        myList.add(10);
        myList.add(7);
        myList.add(10);
        myList.add(3);
        myList.add(10);
        System.out.println("myList = " + myList); //[7, 3, 4, 10, 7, 10, 3, 10]

        myList.removeFirstOccurrence(7);// [ 3, 4, 10, 7, 10, 3, 10]
        System.out.println(myList);

        myList.removeLastOccurrence(3);
        System.out.println(myList);
    }
}
