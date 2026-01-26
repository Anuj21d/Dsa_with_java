;
public class binarytodecimal {
    public static void main(String[] args) {
        int num = 110;
        int ans = 0;
        int i = 0;
    while (num != 0){
        int bit = num %10;
        if(bit == 1)
            ans = ans + bit*(int)Math.pow(2, i);
        i++;
        num = num / 10;
    }
    System.out.println(ans);
}}
