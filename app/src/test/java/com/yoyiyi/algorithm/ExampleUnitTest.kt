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
        val ask = Ask003()
        val nums = intArrayOf(2, 3, 1, 0, 2, 5)
        val duplication = intArrayOf(-1)
        val duplicate = ask.duplicate(nums, duplication)
        if (duplicate) {
            println(duplication[0])
        }
    }

    @Test
    fun testAsk004() {
        val arr = Array(5) { Array(5) { i -> i } }
        arr[0] = intArrayOf(1, 4, 7, 11, 15).toTypedArray()
        arr[1] = intArrayOf(2, 5, 8, 12, 19).toTypedArray()
        arr[2] = intArrayOf(3, 6, 9, 16, 22).toTypedArray()
        arr[3] = intArrayOf(10, 13, 14, 17, 24).toTypedArray()
        arr[4] = intArrayOf(18, 21, 23, 26, 30).toTypedArray()
        val ask = Ask004()
        val find = ask.find(16, arr)
        println(find)
    }

    @Test
    fun  testAsk005(){
        val ask  = Ask006()
        val ln1 = ListNode()
        val ln2 = ListNode()
        val ln3 = ListNode()
        ln1.any = 1
        ln1.next = ln2

        ln2.any = 2
        ln2.next = ln3

        ln3.any = 3
        val list = ask.printListFromTailToHead1(ln1)
        println(list)
        val list2 = ask.printListFromTailToHead2(ln1)
        println(list2)

    }
}
