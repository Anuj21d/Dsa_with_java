import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        // write a program to print the following pattern
        // 1 2 3 4 
        // 1 2 3 4 
        // 1 2 3 4
        // 1 2 3 4

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();

        // for(int i = 1; i <=n ; i++){
        //     for(int j = 1; j <=n ;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        //  }


        // write a program to print the following pattern
        //4 3 2 1
        //4 3 2 1 
        //4 3 2 1 
        //4 3 2 1

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n ; j++){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
}
