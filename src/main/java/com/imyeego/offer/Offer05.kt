package com.imyeego.offer

import java.util.*

/**
 *
 * @authur : liuzhao
 * @date : 12/9/20:3:59 PM
 * @des  :
 */

var list = ArrayList<Int>()

fun main() {


    var node5 = ListNode(5, null)
    var node4 = ListNode(4, node5)
    var node3 = ListNode(3, node4)
    var node2 = ListNode(2, node3)
    var node1 = ListNode(1, node2)

    toToHeadWithIterative(node1)
    list.forEach { print(it) }

}

fun toToHeadWithIterative(node: ListNode?) {
    var node0 = node
    var stack = Stack<Int>()
    var count = 0
    while (node0!= null) {
        stack.push(node0.value)
        node0 = node0.next
        count ++
    }

    for (i in 0..(count - 1)) {
        list.add(stack.pop())
    }



}