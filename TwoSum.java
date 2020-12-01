public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Constraints:
    2 <= nums.length <= 10^3
    -10^9 <= nums[i] <= 10^9
    -10^9 <= target <= 10^9
    Only one valid answer exists.

     */
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[]{0,1};
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }

    public static void testTwoSum(){
        System.out.println("begin Two Sum test.");
        int[] ints = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(ints, target);
        System.out.println("target = " + target + ": result: " + ints[result[0]] + " + " + ints[result[1]] + " = " + (ints[result[0]]+ints[result[1]]) );
        System.out.println("End Two Sum test");

    }
}
