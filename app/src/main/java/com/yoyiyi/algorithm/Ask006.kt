package com.yoyiyi.algorithm

/**
 * 从尾到头打印链表
 *
 *
 * 从尾到头反过来打印出每个结点的值。
 *
 */

class ListNode{
    var any :Int?=null
    var next :ListNode?=null
}

class Ask006{

    fun printListFromTailToHead1(listNode:ListNode):MutableList<Int>{
        val list = mutableListOf<Int>()
        var tmp:ListNode?  = listNode
        while(tmp!=null) {
            list.add(0, tmp.any!!)
            tmp = tmp.next
        }
        return list
    }


    //递归
    val list = mutableListOf<Int>()
    fun printListFromTailToHead2(listNode:ListNode?):MutableList<Int>{
        if(listNode!=null){
            printListFromTailToHead2(listNode.next)
            list.add(listNode.any!!)
        }
        return list
    }
}