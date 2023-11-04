package day12_arraylists;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {



        int [] numbers = new int[4];
        numbers[0] = 13;
        numbers[1] = 56;
        numbers[2] = 55;
        numbers[3] = 12;
        System.out.println(Arrays.toString(numbers));
        int product = 1;
        for (int i=0; i<numbers.length; i++){
            product = product*numbers[i];
        }
        System.out.println(product);




        //////////////////////
        int [] num = {8, 12, 34, 10, 78, 19};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int difference = num[num.length-1] - num[0];
        System.out.println("difference = " + difference);




        //////////////////////////////////////
        int [] arr = {8, 12, 34, 10, 78, 19};
        int maximum = arr[0];
        int minimum = arr[0];
        for (int w: arr){
            maximum = Math.max(maximum,w);
            minimum = Math.min(minimum,w);
        }
        System.out.println("maximum value is = " + maximum);
        System.out.println("minimum value is = " + minimum);


        //////////////////////////////////////////////
        //Example 3: Create a String Array, add 5 elements in it,
        // find the sum of the number of characters in all Strings
        String [] cities = {"Istanbul","London","Madrid","Barcelona","New York"};
        int sum = 0;
        for (String w: cities){
            sum = sum+w.length();
        }
        System.out.println("sum = " + sum);


        ////////////////////////////////////////////////////////////////
        // Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]
        int [] arr2 = {0, 2, 3, 0, 12, 0};
        int [] newarr2 = new int[arr2.length];
        int idx = 0;
        for (int w : arr){
            if (w!=0){
                newarr2[idx] = w;
            }
        }
        System.out.println(Arrays.toString(newarr2));


    }
}
