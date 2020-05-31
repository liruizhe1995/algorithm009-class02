// Brute Force

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[]{ i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/

// Hash Map

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (result.containsKey(complement)) {
                return new int[]{ result.get(complement), i};
            }
            result.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
