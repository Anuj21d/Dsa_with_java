import java.util.*;

public class dTobfor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int original = n;          // ✅ save original
        n = Math.abs(n);

        int ans = 0;
        for (int i = 0; n != 0; i++) {
            int bit = n & 1;
            ans = ans + bit * (int) Math.pow(10, i);
            n = n >> 1;
        }

        // 1's complement (digit-wise)
        int ones = 0;
        int place = 1;
        int temp = ans;
        while (temp != 0) {
            int digit = temp % 10;
            digit = (digit == 0) ? 1 : 0;
            ones = ones + digit * place;
            place *= 10;
            temp /= 10;
        }
        String twos = (String)ones + 1;

        System.out.println("Binary of " + original + " is " + ans);
        System.out.println("Ones complement of " + original + " is " + ones);
        System.out.println("Twos complement of " + original + " is " + twos);
    }
}
