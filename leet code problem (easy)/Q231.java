import java.util.*;
public class Q231 {
    public static void main(String[] args) {
    int n;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sc.nextInt();
    
    if(n <= 0){
            System.out.println("false");
            return;
    }
    while(n > 1){
        if(n % 2 != 0){
            System.out.println("false");
            return;
        }
        n /= 2;
    }
        System.out.println("true");
    }
    // for(int i = 0;i <= 30; i++){
    //         int ans = (int)Math.pow(2,i);
    //         if(ans == n){
    //             return true;
    //         }
    //     }
    //     return false;
}
