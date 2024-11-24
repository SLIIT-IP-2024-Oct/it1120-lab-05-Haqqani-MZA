import java.util.Scanner;

public class IT24103671Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members should be greater than or equal to 0.");
            return;
        }

        switch (newMembers) {
            case 0:
                System.out.println("Prize: No Prize");
                break;
            case 1:
                System.out.println("Prize: Prize is a Pen");
                break;
            case 2:
                System.out.println("Prize: Prize is a Umbrella");
                break;
            case 3:
                System.out.println("Prize: Prize is a Bag");
                break;
            case 4:
                System.out.println("Prize: Prize is a Travelling Chair");
                break;
            default:
                System.out.println("Prize: Prize is a Headphone");
                break;
        }
    }
}
