package com.imyeego.offer

import java.util.*

/**
 *
 * @authur : liuzhao
 * @date : 12/9/20:4:47 PM
 * @des  :
 */

fun main() {
    val s = "a  b c   d  e f  "
    print(replaceBlank(s))
}

fun replaceBlank(string: String) : String {
    var chars = string.toCharArray()
    val len = chars.size
    var count = 0
    for (ch in chars) {
        if (ch == ' ') count ++
    }
    val newLength = len + 2 * count
    chars = chars.copyOf(newLength)
    var i = len - 1
    var j = newLength - 1

    while (i >= 0 && j >= 0) {
        if (chars[i] == ' ') {
            chars[j--] = '0'
            chars[j--] = '2'
            chars[j--] = '%'
            i --
        } else {
            chars[j--] = chars[i--]
        }
    }
    return String(chars)
}