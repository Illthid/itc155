// Problem 1:
// Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings).
//The program will read a list of one word names (until -1), and use a recursive method to create and output 
//all possible orderings of those names, one ordering per line.
//5/26/2020
//David Barnette
import java.util.*;

public class DescendingOrder {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int numElements = 0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, (max=10), separated by a space. -1 to exit :");
        int input = scanner.nextInt();

        while (input != -1) {
            numbers[i] = input;
            i++;
            numElements++;
            input = scanner.nextInt();
        }
        selectionSortDescendTrace(numbers, numElements);
        scanner.close();
    }

    public static void selectionSortDescendTrace(int[] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; i++) {
            int biggestIndex = i;
            for (int j = i + 1; j < numElements; j++) {
                if (numbers[j] > numbers[biggestIndex]) {
                    biggestIndex = j;
                }
            }
            int temporary = numbers[i];
            numbers[i] = numbers[biggestIndex];
            numbers[biggestIndex] = temporary;

            for (int k = 0; k < numElements; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }

    }

}
