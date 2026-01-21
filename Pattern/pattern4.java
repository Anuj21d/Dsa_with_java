import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
         // write a program to print the following pattern
        // 1 2 3 
        // 4 5 6
        // 7 8 9

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();

        int count = 1;
        for(int i = 1 ; i <=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
