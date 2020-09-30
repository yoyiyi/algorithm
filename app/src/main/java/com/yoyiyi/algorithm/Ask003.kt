package com.yoyiyi.algorithm

/**
 * 类名：ask003
 * 描述：TODO
 * 时间：2020/9/30 10:56
 * @author <a href="2455676683@qq.com">zzq</a>
 * @version 1.0
 */
/**
 * 数组中重复的数字
 *
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 *Input:
 *{2, 3, 1, 0, 2, 5}
 *
 *Output:
 *2
 *
 */
class Ask003 {
    fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    fun duplicate(nums: IntArray, duplication: IntArray): Boolean {
        if (nums.isEmpty()) return false
        nums.forEachIndexed { i, v ->
            while (v != i) {
                if (v == nums[v]) {
                    duplication[0] = v
                    return true
                }
                swap(nums, i, v)
            }
        }
        return false
    }
}

