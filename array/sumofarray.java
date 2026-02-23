public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {5,10,20,30,5};

        System.out.print("Print Array:");
        for(int i = 0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        int sum = 0;
        for(int i = 0;i<=arr.length-1;i++){
            sum += arr[i];
        }
        System.out.print("sum :"+ sum);
    }
}
