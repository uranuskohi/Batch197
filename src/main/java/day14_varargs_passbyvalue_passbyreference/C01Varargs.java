package day14_varargs_passbyvalue_passbyreference;

public class C01Varargs {
    public static void main(String[] args) {


        int r1 = add();
        System.out.println(r1);
        int r2= add(3);
        int r3= add(3,4,5);
        int r4= add(3,2,5,8,8,9,6,456,5);
        System.out.println(r4);
        System.out.println(r3);

    }

    // Type a code to add integers
    public static int add(int a , int b){
        return a+b;
    }

    // What if i give you three ints?
    public static int add(int a , int b , int c){
        return a+b+c;
    }

    // "VarArgs" stands for variable argument
    // "VarArgs" has logic of arrays behind. when using varargs think of arrays.
    // You can not add another parameter after vararg
    // If you will work with other parameters use them before vararg
    // You cannot add another parameter (variable) after Vararg, because it is never ending pit.
    //You can input parameter before Vararg, so they do that action first then fill the Vararg.

    public static int add(int ... a){
        int sum = 0;
        for (int w : a){
            sum = sum+w;
        }
        return sum;
    }

}
