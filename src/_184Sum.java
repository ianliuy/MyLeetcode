import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _184Sum {
    /**
     * 18. 4Sum
     * Given an array nums of n integers and an integer target,
     * are there elements a, b, c, and d in nums such that a + b + c + d = target?
     * Find all unique quadruplets in the array which gives the sum of target.
     *
     * Note:
     * The solution set must not contain duplicate quadruplets.
     *
     * Example:
     * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
     * A solution set is:
     * [
     *   [-1,  0, 0, 1],
     *   [-2, -1, 1, 2],
     *   [-2,  0, 0, 2]
     * ]
     * */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int low = j + 1, high = nums.length - 1, sum = target - nums[i] - nums[j];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        if (!res.contains(Arrays.asList(nums[i], nums[j], nums[low], nums[high]))) res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while (low < high && nums[low] + nums[high] == sum) low++;
                    }
                    else if (nums[low] + nums[high] < sum) low++;
                    else high--;
                }
            }
        }
        return res;
    }
    /**
     * 这道题的总结：定义一个新的List<List<```>>的方法：List<List<```>> res = new ArrayList<>();
     * List of List; ArrayList接口和实例化
     * List.contain(```) List中是否存在```
     * Arrays.asList(````) 将几个数字作为一个List，其中这个List是为了List of List做了修改的（定性理解）
     *
     * */
}
