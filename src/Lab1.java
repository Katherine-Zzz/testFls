import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Prime numbers:");
            for (int i = a; i <= b; i++) {
                if (isPrime(i))
                    System.out.print(i + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Enter integer numbers");
        }
    }

    public static boolean isPrime(int num) {
        if ((num < 2) || (num % 2 == 0))
            return false;
        for (int i = 3; i <= Math.round(Math.sqrt(num)); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
