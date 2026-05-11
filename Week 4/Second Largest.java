class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
