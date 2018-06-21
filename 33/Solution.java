

public class Solution {

    public int search(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
    // Input: nums = [4,5,6,7,0,1,2], target = 0
    // Output: 4

        Solution app = new Solution();


        int[] nums = new int[] {9,4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(app.search(nums, target));

    }


}