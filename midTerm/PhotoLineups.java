import java.util.Scanner;
import java.util.ArrayList;
//Given a HashMap pre-filled with student names as keys and grades as values, 
//complete main() by reading in the name of a student, outputting their original
//grade, and then reading in and outputting their new grade.
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
