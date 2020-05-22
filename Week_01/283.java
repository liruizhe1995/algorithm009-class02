// 283.移动零

class Solution {
    public void moveZeroes(int[] nums) {
        // index j for pointing zeros
        int j = 0;
        //for loop
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                // swap 0 and non-zero
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
