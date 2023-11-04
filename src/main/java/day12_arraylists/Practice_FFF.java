package day12_arraylists;

public class Practice_FFF {
    public static void main(String[] args) {


        /////////////////////////////////////
        float f = (float) 0.67;
        if(f == 0.67) {
            System.out.print("yes");
        }else {
            System.out.print("no");
        }
        System.out.println();





        /////////////////////////////////////
        float f1= (float) 0.67;
        if(f1 == 0.67f) {
            System.out.print("yes");
        }else {
            System.out.print("no");
        }



        float a = 0.67F;
        double b = 0.67;
        boolean floatVsDouble = (double) a == b;
        System.out.println("floatVsDouble = " + floatVsDouble);


    }
}
