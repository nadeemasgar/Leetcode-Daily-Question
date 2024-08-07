class Solution {
    public void rotate(int[] nums, int k) {
        if(k == nums.length) {
            return;
        }

        k = k % nums.length;

        if(k < 0) {
            k = k + nums.length;
        }

        reverse(nums, 0, nums.length - 1);

        int ls = 0;
        int le = nums.length - 1;

        reverse(nums, ls, k - 1);
        reverse(nums, k, le);
    }

    public void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--; 
        }
    }
}