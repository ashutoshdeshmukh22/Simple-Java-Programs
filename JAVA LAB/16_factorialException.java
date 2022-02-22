import java.util.Scanner;

class negativeNumberException extends Exception {
    public negativeNumberException(String s) {
        super(s);
    }
}

public class factorialException {
    public static void main(String[] args) {
        int i, fact = 1;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter The Number : ");
            int number = sc.nextInt();
            if (number < 0) {
                throw new negativeNumberException("Negative Number Is Entered");
            } else {
                for (i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + number + " is: " + fact);
            }
        } catch (negativeNumberException e) {
            System.out.println("There is a negativeNumberException : " + e.getMessage());

        }

    }
}
