class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int i = 0, j = height.length - 1;

        while(i < j) {
            int length = Math.min(height[i], height[j]);
            int width = j - i;
            int area = length * width;
            max = Math.max(max, area);

            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }
}