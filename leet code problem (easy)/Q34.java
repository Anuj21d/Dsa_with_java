
class Solution {

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

    public int[] searchRange(int[] nums, int target) {
        int firstOccurence = findFirstOccurence(nums, target);
        int lastOccurence = findLastOccurence(nums, target);
        return new int[]{firstOccurence, lastOccurence};
    }
}
