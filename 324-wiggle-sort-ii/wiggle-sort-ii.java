class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int median = temp[n / 2];
        int left = 0, i = 0, right = n - 1;
        while (i <= right) {
            int idx = (1 + 2 * i) % (n | 1);
            if (nums[idx] > median) {
                int lIdx = (1 + 2 * left) % (n | 1);
                swap(nums, idx, lIdx);
                left++;
                i++;
            }
            else if (nums[idx] < median) {
                int rIdx = (1 + 2 * right) % (n | 1);

                swap(nums, idx, rIdx);
                right--;
            }
            else {
                i++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}