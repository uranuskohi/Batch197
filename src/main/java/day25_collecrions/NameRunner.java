package day25_collecrions;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class NameRunner {
    public static void main(String[] args) throws IllegalNameException {
        List<String> names = new ArrayList<>();
        addName(names,"Uranus");
        addName(names,"54nus");
        System.out.println(names);


    }
    //Create a method that adds given name to a class list
    public static void addName(List<String> list, String name) throws IllegalNameException {
        char initial = name.charAt(0);
        if (initial > 64 && initial < 123) {
            list.add(name);
        }else {
            throw new IllegalNameException("Name must start with letters");
        }

    }


}
