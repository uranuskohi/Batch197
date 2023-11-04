package day10_loops_arrays;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {

        // When we learn smt new follow these step: 1) What   2) Why
        //                       3)Low-level implementations 4) mid-level implement.
        //                      5) Advanced-Level imp.  6) projects


        // Arrays are used to store multiple data.
        // Data type of each element must be the same.

        // How to create an Array:
        String [] stdNames = new String[5]; // [null,null,null,null,null]

        // How to print Array on the console
        System.out.println(stdNames); // prints references
        System.out.println(Arrays.toString(stdNames));

        // How to add elements to the Array:
        stdNames[0] = "Mary";
        stdNames [3] = "John";
        stdNames [1] = "Tom";
        stdNames [4] = "Julie";
        stdNames [2] = "Murat";
        System.out.println(Arrays.toString(stdNames));

        // How to get specific element from an Array:
        String thirdStd = stdNames[2];
        System.out.println(thirdStd);

        // Example 1: Create an int Array then find the multiplication of them.
        int [] numbers = new int[4];
        numbers[0]= 12;
        numbers[1]= 5;
        numbers[2]= 4;
        numbers[3]= 2;
        System.out.println(Arrays.toString(numbers));


        // First way:
        int product = 1;
        for (int i = 0; i<numbers.length; i++ ){
            product = product*numbers[i];
        }
        System.out.println(product);

        // second way: for each loop (Enhanced loop) --> works with Arrays and collections
        //             if you need to use indexes you cannot use for each


        int n = 1;
        for (int w: numbers) {
            n = n * w;
        }
        System.out.println(n);


        // Example :  find the difference between maximum and min value of array elements
        //            [8,12,34,10,78,19]

        int [] numsArr = {8,12,34,10,78,19};
        System.out.println(Arrays.toString(numsArr));


        Arrays.sort(numsArr);
        System.out.println(Arrays.toString(numsArr));


        int difference = numsArr[numsArr.length-1] - numsArr[0];
        System.out.println("difference = " + difference);


    }
}
