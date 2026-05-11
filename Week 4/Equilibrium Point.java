class Solution {
    public static int equilibriumPoint(long[] arr, int n) {
        if (n == 1) {
            return 1;
        }
        
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];
            
            if (leftSum == rightSum) {
                return i + 1;
            }
            
            leftSum += arr[i];
        }
        
        return -1;
    }
}
