import java.util.Arrays;

public class _163SumClosest {
    /**
     * 16. 3Sum Closest
     * Given an array nums of n integers and an integer target,
     * find three integers in nums such that the sum is closest to target.
     * Return the sum of the three integers. You may assume that each input would have exactly one solution.
     *
     * Example:
     * Given array nums = [-1, 2, 1, -4], and target = 1.
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     * */
    public static int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int tem = nums[i] + nums[low] + nums[high];
                if (tem == target) return target;
                else {
                    if (isvalid(target, res, tem)) res = tem;
                    if (target - tem > 0) low++;
                    if (target - tem < 0) high--;
                }
            }
        }
        return res;
    }
    public static boolean isvalid(int target, int res, int tem) {
        if (res == Integer.MAX_VALUE) return true;
        return Math.abs(target - tem) < Math.abs(target - res);
    }
    public static void main(String[] args){
        int[] nums = new int[]{-1, 2, 1, 4};
        int target = 1;
       /* for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/
        System.out.println(threeSumClosest(nums, target));
    }
    /**
     * 1. 创建数组：
     * int[] nums = new int[]{x,x,x,x,x};
     * 2. Arrays.sort() 排序的结果是从小到大排
     * 3. javac xxxx.java; 得到一个 xxxx.class文件
     * java xxxx
     * 4. 如果想调用，写成静态函数（但是不理解这么写其中的原理）
     *
     * */

}
