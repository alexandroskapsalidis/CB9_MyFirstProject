package factorialnumberwithrecursion;

import java.util.Scanner;

public class FactorialNumberWithRecursion {

    public static void main(String[] args) {

        // Computing Factorial number
        // Using Loop
        System.out.println("Give the number to compute the factorial");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long factorial = 1;
        if (number == 0) {
            System.out.println("The factorial number of " + number + " is: 0");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial number of " + number + " is: " + factorial);
        }
        System.out.println("-------------------------");

        //  Computing Factorial number Using Recursion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        long factor = fact(num);
        System.out.println("Factorial of entered number is: " + factor);
    }
    
    // Recursion Method
    static long fact(int n) {
        long output;
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        output = fact(n - 1) * n; // Recursion: Function calling iself
        return output;

    }

}
