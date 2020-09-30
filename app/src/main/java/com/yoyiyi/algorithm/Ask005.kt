package com.yoyiyi.algorithm

/**
 * 替换空格
 *
 *
 * 将一个字符串中的空格替换成 "%20"。
 *
 */
class Ask005{

    fun replaceSpace1(str: StringBuffer): String {
      return str.toString().replace(" ","%20")
    }

    fun replaceSpace2(str: StringBuffer): String {
        val  sb  =  StringBuilder()
        str.forEach {
            if (it == ' ') sb.append("%20")
            else sb.append(it)
        }
        return sb.toString()
    }
}