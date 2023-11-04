package practice_dt.practice03;

public class Class01 {
    public static void main(String[] args) {

        int x = 4;
        long y = x*4 -(x + 1);
        if (y>11){
            System.out.println("Too Low");
        }else if (x>11){
            System.out.println("Too High");
        }else {
            System.out.println("Just Right");
        }
        System.out.println();


        ///////////////////////////////////////////////////////
        int x1 = 6;
        int result = x1 > 3 ? x1<5 ? 11:9:8;
        System.out.println(result);



        /////////////////////////////////////////////////////////
        int m = 10;
        int n = 2;
        int sum = 0;
        while (m > n){
            m--;
            n = n+2;
            sum = sum+m+n;
        }
        System.out.println(sum);


        //////////////////////////////////////////////////////////
        int i = 1;
        int x2 = 2;
        while (i <4){
            x=x+i;
            i++;
        }
        System.out.println(x);

    }
}
