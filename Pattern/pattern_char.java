public class pattern_char {
    public static void main(String[] args) {
        // AAA
        // BBB
        // CCC
        int n = 3;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}
