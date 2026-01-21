public class pattern_new_num_t {
     public static void main(String[] args) {  
        // 1
        // 23
        // 345
        // 4567
        // int n= 4;
        // for(int i = 1;i<=n;i++){
        //     int num = i;
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }

        int n= 4;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+j-1);
            }
            System.out.println();
        }
    }   
}
