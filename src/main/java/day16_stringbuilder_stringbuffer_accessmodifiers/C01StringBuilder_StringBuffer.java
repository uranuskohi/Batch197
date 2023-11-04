package day16_stringbuilder_stringbuffer_accessmodifiers;

public class C01StringBuilder_StringBuffer {
    public static void main(String[] args) {

        /*

            1) Java has three ways to create a string data: 1) String Class  2) StringBuilder class  3) StringBuffer class

            2) String Class "immutable" but other two are "mutable"
            When we update a value inString class, Java does not change the original value.---> "immutable"
            Java creates a new container and put updated data in this container
            When you updated value in StringBuilder or StringBuffer Java update the original value ----> "mutable
            3) Is there other immutable classes in Java : Yes all Wrapper classes are immutable.
            4) The differences between StringBuilder and StringBuffer are:
                i) StringBuilder is faster
                ii) StringBuffer is "thread-safe" and "synchronised"
                Thread-safe : Can handle multiple tasks (threads) at the same time
                synchronised: Can put threads in logical order.
         */
        String s = "Java";
        String t = "Java";
        String w = "Apex";
        System.out.println("before " + s); // Java
        s =s.concat("!");
        System.out.println("after " + s); // Java
        StringBuilder y = new StringBuilder("Python");
        StringBuilder z = new StringBuilder("Python");
        y.append("!");
        System.out.println(y);
        StringBuffer x = new StringBuffer("Ruby");
        System.out.println(x);
        // Methods used in StringBuilder:
        StringBuilder a = new StringBuilder();
        a.append("Hi!").append(" Java!...");
        System.out.println(a);
        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("123456789").append("1");
        System.out.println("a.length() = " + a.length());
        System.out.println("a.capacity() = " + a.capacity());  // extra capacity = currentcapacity*2 + 2;
        System.out.println(stateAbbr.capacity());
        System.out.println(stateAbbr.length());
        a.reverse(); //...!avaJ !iH
        a.replace(0,4,"*"); // *avaJ !iH
        a.insert(6,"!"); // *avaJ !!iH
        a.delete(6,8);
        a.deleteCharAt(0);
        System.out.println(a);
        // StringBuffer methods:
        StringBuffer sbf = new StringBuffer("Java");
        StringBuffer sbf1 = new StringBuffer("Lava");
        System.out.println(sbf.compareTo(sbf1));  // Compares two StringBuffer instances lexicographically
    }
}