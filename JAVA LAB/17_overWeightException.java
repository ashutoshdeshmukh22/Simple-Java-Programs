import java.util.Scanner;

class OverwtProductException extends Exception {
    public OverwtProductException(String s) {
        super(s);
    }
}

public class overWeightException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight ");
        int Weight = sc.nextInt();
        try {
            if (Weight >= 60) {
                throw new OverwtProductException("Weight is Above 60");
            }
            System.out.println("Success, The Weight is Accepted");
        } catch (OverwtProductException e) {
            System.out.println("There is a OverwtProductException : " + e.getMessage());
        }

    }
}