class Solution {
    public boolean hasDuplicate(int[] nums) {
                if (nums.length == 0) {
            return false;
        }
        boolean check = true;
        Set< Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            check = set.add(nums[i]);
            if (check == false) {
                return true;
            }
        }
        return false;
    }
}