public class pttern_new_num {
    public static void main(String[] args) {
        // 1
        // 21
        // 321
        // 4321
     int n= 4;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }
}
