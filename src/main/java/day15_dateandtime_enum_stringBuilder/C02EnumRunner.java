package day15_dateandtime_enum_stringBuilder;

import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;
import java.util.Scanner;

public class C02EnumRunner {
    public static void main(String[] args) {

        // Enum is used to store constant values...

        String capital =  UsStates.PENNSYLVANIA.getCapital();
        System.out.println("capital = " + capital);

        System.out.println("UsStates.CALIFORNIA.getAbbreviation() = " + UsStates.CALIFORNIA.getAbbreviation());

        //Example 1: Ask user to enter state name then give user capital city
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter state name:");
        String state = input.nextLine().toUpperCase();

        switch (state){
            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapital());
                break;
            case "ALASKA":
                System.out.println(UsStates.ALASKA.getCapital());
                break;
            case "AMERICAN SAMOA":
                System.out.println(UsStates.AMERICAN_SAMOA.getCapital());
                break;
            case "ARIZONA":
                System.out.println(UsStates.ARIZONA.getCapital());
                break;
            case "ARKANSAS":
                System.out.println(UsStates.ARKANSAS.getCapital());
                break;
            default:
                System.out.println("Invalid state name");
        }

        UsStates [] states = UsStates.values();
        System.out.println(Arrays.toString(states));
        for (UsStates w: states){
            if (state.equals(w.toString())){
                System.out.println(w.getCapital());
            }
        }
    }
}
