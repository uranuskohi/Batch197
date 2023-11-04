package day08_for_loop;

public class Practice {
    public static void main(String[] args) {

        // type code to reverse everything back
        //  "You are beautifull"

        String s = "You are beautifull";
        String s2 = "";
         for ( int i = s.length()-1 ;  i>=0 ;  i-- ){
             s2 = s2+s.charAt(i);
             System.out.println("s2 = " + s2);
         }
        System.out.println(s2);



        System.out.println();
         // second one
        String s3 = "Uranus Kohi";
        String reverse = "";
        for ( int i = s3.length()-1 ; i>=0 ; i--) {
            reverse = reverse+s3.charAt(i);
            System.out.println("reverse = " + reverse);
        }
        System.out.println(reverse);






    }
}
