class Solution {
    public int hammingWeight(int n) {
       int bit = 0;
        while(n!=0){
            int rem = n%2;
            bit = bit + rem;
            n = n/2;
        }
        return bit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.hammingWeight(11);
        System.out.println(result);
    }
}
