package io.github.jiashunx.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author jiashunx
 */
public class $0001 {

    public static void main(String[] args) {
        int[] nums = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 15;
        int[] indexes = new $0001().twoSum(nums, target);
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            if (map.containsKey(expect) && map.get(expect) != i) {
                return new int[] { i, map.get(expect) };
            }
        }
        return new int[] {};
    }

}
