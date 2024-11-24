import java.util.Scanner;

public class IT24103671Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        while (count < 3) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }

            count++;
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}
