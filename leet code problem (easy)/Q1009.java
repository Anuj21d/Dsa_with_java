class Solution {
    public int bitwiseComplement(int n) {
        int m  = n;
        int mask = 0;
        //edge case
        if(n == 0)
            return 1;
        while(m != 0){
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        int ans = (~n) & mask;
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int ans = s.bitwiseComplement(n);
        System.out.println(ans);
    }
}