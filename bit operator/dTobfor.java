import java.util.*;

public class dTobfor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int original = n;          // ✅ save original
        n = Math.abs(n);

        
        int i = 0, binary = 0;
        while (n!=0){
            int bit = n & 1;
            
            binary = binary | (bit << i);
            i++;
            n = n>> 1;
        }
        binary = binary | (0 << i);
        System.out.println("Binary: " + Integer.toBinaryString(binary));
        int ones = ~binary;
        System.out.println("Ones: " + Integer.toBinaryString(ones));
        int twos = ones +1;
        System.out.println("Twos: " + Integer.toBinaryString(twos));


        // again converting negative in decimal to check correct value

        int aones =  ~twos;
        int atwos = aones + 1;
        System.out.println("Again in decimal: " + atwos);
    }
}
