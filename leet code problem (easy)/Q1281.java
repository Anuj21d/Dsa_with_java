class Question {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n /= 10;
        }
        int result = product - sum;
        return result;
    }

    public static void main(String[] args) {
        Question question = new Question();
        int result = question.subtractProductAndSum(243);
        System.out.println(result);
    }
}
