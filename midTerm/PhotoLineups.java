import java.util.Scanner;
import java.util.ArrayList;

//Problem 1
//Write a program that lists all ways people can line up for a photo 
//(all permutations of a list of Strings). The program will read a list of
//one word names (until -1), and use a recursive method to create and output 
//all possible orderings of those names, one ordering per line.
//05/26/2020
//David Barnette

public class PhotoLineups {

    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> permList = new ArrayList<String>();
        String name;
    }

    public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        System.out.println("Please enter name with space in between. -1 to exit: ");
        scanner = null;
        String name = scanner.next();

        while (!name.equals("-1")) {
            nameList.add(name);
            name = scanner.next();
        }
    }

}
