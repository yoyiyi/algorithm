package com.yoyiyi.algorithm

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testAsk003() {
        var ask = Ask003()
        var nums = intArrayOf(2, 3, 1, 0, 2, 5)
        var duplication = intArrayOf(-1)
        val duplicate = ask.duplicate(nums, duplication)
        if (duplicate) {
            println(duplication[0])
        }
    }
}
