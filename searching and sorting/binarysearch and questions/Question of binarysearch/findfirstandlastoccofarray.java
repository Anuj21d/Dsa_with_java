
public class findfirstandlastoccofarray {
//     Problem statement
// You have been given a sorted array/list 'arr' consisting of ‘n’ elements. You are also given an integer ‘k’.

// Now, your task is to find the first and last occurrence of ‘k’ in 'arr'.
// Note :
// 1. If ‘k’ is not present in the array, then the first and the last occurrence will be -1. 
// 2. 'arr' may contain duplicate elements.
// Example:
// Input: 'arr' = [0,1,1,5] , 'k' = 1
// Output: 1 2
// Explanation:
// If 'arr' = [0, 1, 1, 5] and 'k' = 1, then the first and last occurrence of 1 will be 1(0 - indexed) and 2.
    public static int findFirstOccurence(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == k) {
                ans = mid;
                e = mid - 1; // to find first occurence
            } else if (arr[mid] < k) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static int findLastOccurence(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == k) {
                ans = mid;
                s = mid + 1; // to find last occurence
            } else if (arr[mid] < k) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 5};
        int k = 1;
        int firstOccurence = findFirstOccurence(arr, k);
        int lastOccurence = findLastOccurence(arr, k);
        System.out.println(firstOccurence + " " + lastOccurence);
    }

}
