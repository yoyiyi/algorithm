package com.yoyiyi.algorithm

/**
 * 二维数组中的查找
 *
 *给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 *Consider the following matrix:
 *[
 *[1,   4,  7, 11, 15],
 *[2,   5,  8, 12, 19],
 *[3,   6,  9, 16, 22],
 *[10, 13, 14, 17, 24],
 *[18, 21, 23, 26, 30]
 *]

 *Given target = 5, return true.
 *Given target = 20, return false.
 *
 */
class Ask004 {
    fun find(target: Int, matrix: Array<Array<Int>>): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return false
        val rows = matrix.size //行
        val cols = matrix[0].size//列
        var r = 0
        var c = cols - 1
        while (r < rows - 1 && c >= 0) {
            when {
                target == matrix[r][c] -> return true
                target > matrix[r][c] -> r++
                else -> c--
            }
        }
        return false
    }

}