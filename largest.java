import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        System.out.print("1. Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("2. Number: ");
        double num2 = scanner.nextDouble();

        System.out.print("3. Number: ");
        double num3 = scanner.nextDouble();

        double largestNumber = findLargestNumber(num1, num2, num3);

        System.out.println("The largest number is: " + largestNumber);

        scanner.close();
    }

    static double findLargestNumber(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}

