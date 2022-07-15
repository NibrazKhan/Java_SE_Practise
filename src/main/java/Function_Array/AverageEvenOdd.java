//5. Take 5 numbers from users in an array.
// Then find out the average number, how many even and how many odd numbers using these functions:
// average(), countEvenNumbers(), countOddNumbers()
package Function_Array;

import java.util.Scanner;

public class AverageEvenOdd {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + (int)(i + 1) + " :");
            array[i] = sc.nextInt();
        }
        System.out.println("The average is " + average(array));
        System.out.println("Number of Even numbers are " + countEvenNumbers(array));
        System.out.println("Number of odd numbers are " + countOddNumbers(array));
    }

    public static double average(int[] array) {
        double sum = 0.0;
        for (double values :
                array) {
            sum += values;

        }
        return sum / array.length;

    }

    public static int countEvenNumbers(int[] array) {
        int evenNumberCount = 0;
        for (int values :
                array) {
            if (values % 2 == 0) {
                evenNumberCount += 1;
            }

        }
        return evenNumberCount;
    }

    public static int countOddNumbers(int[] array) {
        int oddNumberCount = 0;
        for (int values :
                array) {
            if (values % 2 == 1) {
                oddNumberCount += 1;
            }

        }
        return oddNumberCount;
    }
}
