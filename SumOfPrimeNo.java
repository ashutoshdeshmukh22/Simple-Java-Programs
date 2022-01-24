
public class SumOfPrimeNo {
    public static void main(String[] args) {
        int n = 15, sum = 0, i = 1, j;
        int temp = n;
        while (n != 0) {
            int count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum = sum + i;
                n--;
            }
            i++;
        }
        System.out.println("Sum of first " + temp + " Prime numbers is " + sum);
    }
}
