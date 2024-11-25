import java.util.Scanner;

public class IT24103671Lab4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.print("Enter the first integer: ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int numberTwo = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int numberThree = scanner.nextInt();

        smallest = numberOne;
        largest = numberOne;
        
        if (numberTwo < smallest) {
            smallest = numberTwo;
        }
        if (numberTwo > largest) {
            largest = numberTwo;
        }
        if (numberThree < smallest) {
            smallest = numberThree;
        }
        if (numberThree > largest) {
            largest = numberThree;
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
