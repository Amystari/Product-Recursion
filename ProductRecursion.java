import java.util.Scanner;

public class ProductRecursion {

    public static int recursiveProduct(int[] numbers, int index) {

        if (index == numbers.length) {
            return 1;
        }

        return numbers[index] * recursiveProduct(numbers, index + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int result = recursiveProduct(numbers, 0);

        System.out.println("The product of the five numbers is: " + result);

        input.close();
    }
}
