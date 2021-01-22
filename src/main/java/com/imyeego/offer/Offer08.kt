package com.imyeego.offer

/**
 *
 * @authur : liuzhao
 * @date : 12/11/20:9:09 AM
 * @des  :
 */

fun main() {

    var array = intArrayOf(3, 4, 5, 1, 2)

    println(minNumber0(array))
    println(minNumber1(array))
}

/**
 * 最小值
 */
fun minNumber0(array: IntArray) : Int? {

    var min = Int.MAX_VALUE
    if (array.isNotEmpty()) {
        for (v in array) {
            if (v < min) {
                min = v
            }
        }
    }
    return min
}

/**
 * 最大值后面的
 */
fun minNumber1(array: IntArray): Int? {
    var min = Int.MAX_VALUE
    if (array.isNotEmpty()) {
        for (i in 0 until array.size - 1) {
            if (array[i] > array[i + 1])
                min = array[i + 1]
        }
    }

    return min
}

/**
 * 二分查找
 */
fun minNumber2(array: IntArray): Int? {
    var min = Int.MAX_VALUE


    return min
}