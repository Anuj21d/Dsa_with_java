import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; n != 0; i++){
            int bit = n & 1 ;
            ans = ans + (bit * (int)Math.pow(10, i));
            n = n >> 1;
        }
        System.out.println("Binary number is: " + ans);
    }
}
