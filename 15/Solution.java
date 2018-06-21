import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Solution {

    // sort(S);
    // for i=0 to n-2 do
    //    a = S[i];
    //    start = i+1;
    //    end = n-1;
    //    while (start < end) do
    //       b = S[start]
    //       c = S[end];
    //       if (a+b+c == 0) then
    //          output a, b, c;
    //          // Continue search for all triplet combinations summing to zero.
    //          if (b == S[start + 1]) then
    //             start = start + 1;
    //          else
    //             end = end - 1;
    //       else if (a+b+c > 0) then
    //          end = end - 1;
    //       else
    //          start = start + 1;
    //    end
    // end
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n-2; i++) {
            
            int a = nums[i];
            int start = i + 1;
            int end = n - 1;

            while( start < end ) {

                int b = nums[start];
                int c = nums[end];

                if (a+b+c == 0) {

                    res.add(new ArrayList<>(Arrays.asList(a, b,  c)));

                    if ( b == nums[start+1] ) {
                        start += 1;
                    } else {
                        end -= 1;
                    }

                } else if (a+b+c > 0) {
                    end -= 1;
                } else {

                    start += 1;
                }

            }

        }
        return res;
    }


    public static void main(String[] args) {
        
        Solution app = new Solution();

        //[-1, 0, 1, 2, -1, -4]
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = app.threeSum(input);

        for( List<Integer> tripple : res) {

            System.out.println("[" + tripple.get(0) + "," + tripple.get(1) + "," + tripple.get(2) + "]");
        }



    }



}