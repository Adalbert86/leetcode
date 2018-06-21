
class Solution {

    public static void main(String[] args) {

        // int nums[] = new int[]{2,7,11,15};
        // int target = 9;

        int nums[] = new int[]{-3,4,3,90};
        int target = 0;

        Solution app = new Solution();
        int[] res = app.twoSum(nums, target);

        System.out.println("[" + res[0] + "," + res[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        

        for(int first = 0; first < nums.length; first++) {
                
                for(int second = first + 1; second < nums.length; second++) {
                    
                    if(nums[first] + nums[second] == target) {

                        return new int[]{first, second};
                    }

                }

        }

        return null;
    }
    
}