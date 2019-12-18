import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _153Sum {
    /**
     * 15. 3Sum
     * Given an array nums of n integers, are there elements a, b, c in nums such that
     * a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
     *
     * Note:
     * The solution set must not contain duplicate triplets.
     *
     * Example:
     * Given array nums = [-1, 0, 1, 2, -1, -4],
     * A solution set is:
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     * */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else high--;
            }
        }
        return res;
    }
    /**
     * 做题的总结：
     * 1. 如何定义新的三维数组：
     * List<List<Integer>> res = new ArrayList<>();
     * 2. 如何开始新的循环：
     * for (int i = 0; i < res.length; i++) {
     *
     * }
     * 3. 定义多个int变量
     * int sum = ..., low = ..., high = ...;
     * 4. 在array中添加新的元素
     * res.add(Array.asList(x, y, z));
     * */
}
