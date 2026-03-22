import java.util.Scanner;
class LinearSearch{
    static boolean linearSearch(int[] arr, int key) {
        
        for(int i = 0 ; i < arr.length- 1; i++) {
            if(arr[i] == key) {
                return true;   // found
            }
        }
        return false;  // not found
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = { 1 , 2 , 3 , 10 , 11};
        System.out.println("Enter number want to search:");
        int key = sc.nextInt();

        boolean found = linearSearch(arr,key);
        if(found){
            System.out.println("found!!");
        }else{
            System.out.println("not Found!!");
        }
    }
}