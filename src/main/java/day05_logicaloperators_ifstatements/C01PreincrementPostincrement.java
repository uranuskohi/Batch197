package day05_logicaloperators_ifstatements;

public class C01PreincrementPostincrement {
    public static void main(String[] args) {

        /*
             int a =12;
        Increment            Decrement
          1) a=a+2;           a= a-2;
          2) a+=3;            a-=3;
          3) a= a*5;          a *= 5;
          4) a= a/5           a /= 5;


                        Java gives us opportunity to increment first (pre increment) and increment
                        later (post increment)when we use two operations at the same time with
                        special format to increment

         */

        int a = 12;
        a++; // special format to increment by one only
        System.out.println(a);
        System.out.println(++a);

        // Postincrement
        System.out.println(a);
        a+= 1;
        System.out.println(a++);
        System.out.println(a);

        int b = a++;
        System.out.println(b);
        System.out.println(a);

        // decrement
        int c = --a;
        System.out.println(c);

        // postdecrement

        int d = a--;
        System.out.println(d);
        System.out.println(a);

    }
}
