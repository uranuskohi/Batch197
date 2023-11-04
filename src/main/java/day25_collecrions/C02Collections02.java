package day25_collecrions;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class C02Collections02 {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<String>();
        countries.add("India");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Spain");
        countries.add("Germany");
        System.out.println(countries);

        LinkedList<String> names = new LinkedList<String>();

        Collections.sort(countries);
        System.out.println(countries);

        String country = countries.peek();
        System.out.println(country);
        System.out.println(countries);
        System.out.println("names.peek() = " + names.peek());

        String cnt = countries.element();
        System.out.println(countries);

        System.out.println("names.element() = " + names.element());

    }
}
