class Solution {
    public int reverse(int x) {
        int sum = 0;
        while (x != 0){
            int digit = x % 10;
            if(sum < Integer.MIN_VALUE/10 || sum > Integer.MAX_VALUE/10){
                return 0;
            }
            sum = (sum * 10) + digit;
            x = x / 10;
        }
        return sum;
    }

     public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.reverse(123);
        System.out.println(result);
    }
}
