import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAff = "";

        System.out.print("Please enter your party affiliation [R,D,I]:");

        partyAff = in.next();
        if (partyAff .equalsIgnoreCase("R")) {
            System.out.print("You get a Republican Elephant!");
        } else if (partyAff .equalsIgnoreCase("D")) {
            System.out.print("You get a Democratic Donkey!");
        } else if (partyAff .equalsIgnoreCase("I")) {
            System.out.print("You get an Independent Person!");
        } else {
            System.out.print("You didn't enter the correct letter."); }

    }
}