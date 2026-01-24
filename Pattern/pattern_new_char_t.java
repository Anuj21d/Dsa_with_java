public class pattern_new_char_t {
        public static void main(String[] args) {
        // A
        // BC
        // CDE
        // DEFG
        int n = 4;
        for(int i = 1;i<=n;i++){
            int count = 'A'+n-i;
            for(int j = 1;j<=i;j++){
                System.out.print((char)count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}
