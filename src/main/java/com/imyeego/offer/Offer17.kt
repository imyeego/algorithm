package com.imyeego.offer

/**
 *
 * @authur : liuzhao
 * @date : 2/23/21:4:49 PM
 * @des  :
 */

fun main() {

    val node9 = ListNode(9, null)
    val node8 = ListNode(8, node9)
    val node7 = ListNode(5, node8)

    val node6 = ListNode(3, node7)
    val node5 = ListNode(1, node6)
    val node4 = ListNode(7, null)
    val node3 = ListNode(6, node4)
    val node2 = ListNode(4, node3)
    val node1 = ListNode(2, node2)

    var node = merge(node1, node5)

    while (node != null) {
        print("${node.value}, ")
        node = node.next
    }

}

fun merge(root1: ListNode?, root2: ListNode?): ListNode? {
    var n: ListNode? = null
    var p = root1
    var q = root2

    if (p?.value!! >= q!!.value) {
        n = ListNode(q.value, null)
        q = q.next

    } else {
        n = ListNode(p.value, null)
        p = p.next

    }

    var next = n

    while (p != null || q != null) {
        var newNode: ListNode? = null
        if (p == null || p.value >= q!!.value) {
            newNode = ListNode(q!!.value, null)

            q = q.next
            next?.next = newNode
            next = newNode
            continue
        }

        if (p.value < q.value) {
            newNode = ListNode(p.value, null)

            p = p.next
            next?.next = newNode
            next = newNode
            continue
        }


    }

    return n
}