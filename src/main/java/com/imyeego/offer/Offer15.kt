package com.imyeego.offer

/**
 *
 * @authur : liuzhao
 * @date : 2/23/21:4:02 PM
 * @des  :
 */

fun main() {
    val node7 = ListNode(7, null)

    val node6 = ListNode(6, node7)
    val node5 = ListNode(5, node6)
    val node4 = ListNode(4, node5)
    val node3 = ListNode(3, node4)
    val node2 = ListNode(2, node3)
    val node1 = ListNode(1, node2)

    println(findKthToTail(node1, 4)?.value)
}

fun findKthToTail(root: ListNode?, k: Int): ListNode? {
    if (root == null) return null

    var p = root

    var i = 0

    while (i < k - 1 && p != null) {
        p = p.next
        i ++

    }

    if (i < k - 1) return null

    var q = root

    while (p?.next != null) {
        p = p.next
        q = q?.next
    }
    return q
}

