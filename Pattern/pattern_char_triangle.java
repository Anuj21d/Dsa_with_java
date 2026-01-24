public class pattern_char_triangle {
    public static void main(String[] args) {
        // A
        // BC
        // DEF
        int n = 3;
        int count = 'A';
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
