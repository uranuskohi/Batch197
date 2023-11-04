package day11_arrays;

import java.util.Arrays;

public class C02Arrays03 {
    public static void main(String[] args) {

        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int [] element = {12, 3, -3, 5, 23};
        for (int w: element){
            if (w<5){
                System.out.print(w + "," + " ");
            }
        }
        System.out.println();



        // Example : check if a specific element exists in an Array
        int [] numbers = {12, 3, 14, 5, 23};
        System.out.println(Arrays.binarySearch(numbers, 3));  // binarySearch() returns index of the element if it exists
                                                                    // before using binarySearch() you must sort the Array
                                                                    // if there are repeating elements you cannot use binarySearch()
        Arrays.sort(numbers);
        int idxOfElements = Arrays.binarySearch(numbers,14);
        System.out.println(idxOfElements);

        // If element does not exist in the Array binarySearch() returns
        // "-3"  " - " means  --> does not exist
        //  "3"  means ---> order if it won't

    }
}
