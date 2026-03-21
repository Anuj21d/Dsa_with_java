public class Q1207 {
    public boolean uniqueOccurrences(int[] arr) {

        int n = arr.length;
        int[] freq = new int[n];   // to store frequencies
        int index = 0;

        boolean[] visited = new boolean[n];  // to avoid counting same number again

        // Step 1: Count frequencies
        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            freq[index++] = count;
        }

        // Step 2: Check duplicate frequencies
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (freq[i] == freq[j]) {
                    return false;
                }
            }
        }

        return true;
    }
} 
