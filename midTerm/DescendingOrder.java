
import java.util.*;
//Write a void method selectionSortDescendTrace() that takes an integer array, 
//and sorts the array into descending order. The method should use nested loops
//and output the array after each iteration of the outer loop, thus outputting the
//array N-1 times (where N is the size). Complete main() to read in a list of up
//to 10 positive integers (ending in -1) and then call the selectionSortDescendTrace() method.
//05/26/2020
//David Barnette

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
