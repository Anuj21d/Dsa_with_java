public class pattern_char_2 {
    public static void main(String[] args) {
        // ABC
        // BCD
        // CDE
        int n = 3;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)('A'+ i +j-2));
            }
            System.out.println();
        }
    }
}
