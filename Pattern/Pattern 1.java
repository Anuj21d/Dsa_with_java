import java.util.Scanner;
class Pattern1

{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n=sc.nextInt();
        int i = 1;
        for(i= 1; i <=n ; i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}