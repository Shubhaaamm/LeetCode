class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int val1 = 0; val1<n; val1++){
            int count = 0;
            for (int val2 = 0; val2<n; val2++){
                if (nums[val1]==nums[val2]){
                    count++;

                }
            }
            if (count > n/2){
                return nums[val1];
            }
        }
        return -1;
    }
}