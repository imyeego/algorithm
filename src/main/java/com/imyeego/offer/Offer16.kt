package com.imyeego.offer

/**
 *
 * @authur : liuzhao
 * @date : 2/23/21:2:48 PM
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

    var node = reverseList(node1)

    while (node != null) {
        print("${node.value}, ")
        node = node.next
    }

}

fun reverseList(root: ListNode?): ListNode? {
    var p = root
    if (p?.next == null) return p

    var q = root?.next
    if (q?.next == null) return q
    var n = q.next
    p.next = null
    q.next = p


    while (n != null) {
        p = q
        q = n
        n = n.next
        q.next = p


    }
    return q
}