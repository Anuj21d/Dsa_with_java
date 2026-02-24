public class ReverseArray{

    void printArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverseArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){   // changed here
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int [] arr = { 2 , 4 , 5, 7 , 9 };
        ReverseArray obj = new ReverseArray();

        obj.printArray(arr);
        obj.reverseArray(arr);
        System.out.println();
        obj.printArray(arr);
    }
}