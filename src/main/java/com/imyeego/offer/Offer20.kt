package com.imyeego.offer

/**
 *
 * @authur : liuzhao
 * @date : 12/24/20:2:42 PM
 * @des  : 顺时针打印二维数组
 */


fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(5, 6, 7, 8, 9)
    val array3 = arrayOf(10, 11, 12, 13, 15)
    val array4 = arrayOf(16, 17, 18, 19, 20)
    val array5 = arrayOf(21, 22, 23, 24, 25)

    val matrix = arrayOf(array1, array2, array3, array4, array5)

    printMatrix(matrix)
//    var D = Array(5){Array(4){0}}
//    println(D[2][2])
//
//    D[0][2] = 2
//    println(D[0][2])

}

fun printMatrix(matrix: Array<Array<Int>>) {

    val mat = arrayOf(arrayOf(0, 1), arrayOf(1, 0), arrayOf(0, -1), arrayOf(-1, 0))
    var i = 0
    var j = 0
    var a = 0
    var b = 0

    val row = matrix.size
    val col = matrix[0].size
    var D = Array(row){Array(col){0}}
    val length = row * col

    while ((a++) < length) {
        print("${matrix[i][j]}, ")
        D[i][j] = 1
        if (!judge(i + mat[b][0], j + mat[b][1], D)){
            ++b
            b %= 4
        }

        i += mat[b][0]
        j += mat[b][1]
    }

}

fun judge(i: Int, j: Int, d: Array<Array<Int>>): Boolean {
    return i >= 0 && i < d.size && j >= 0 && j < d[0].size && d[i][j] == 0
}