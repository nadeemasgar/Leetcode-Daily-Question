class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i = 0; 
        int j = n-1;
        int k = n-1;

        while(i <= j) {
            int ele1 = arr[i] * arr[i];
            int ele2 = arr[j] * arr[j];

            if(ele1 > ele2) {
                ans[k] = ele1;
                i++;
            }
            else {
                ans[k] = ele2;
                j--;
            }

            k--;
        }

        return ans;
    }
}