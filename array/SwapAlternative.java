public class SwapAlternative {
    void SwapAlternative(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            if(i + 1 < arr.length){
                swap(arr, i, i + 1);
            }
        }
    }
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void printArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10 , 30 , 40 , 90 , 80 };
        SwapAlternative obj = new SwapAlternative();
        obj.printArray(arr);
        obj.SwapAlternative(arr);
        System.out.println();
        obj.printArray(arr);
    }
}
