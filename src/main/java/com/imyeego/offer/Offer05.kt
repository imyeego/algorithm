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


    val node5 = ListNode(5, null)
    val node4 = ListNode(4, node5)
    val node3 = ListNode(3, node4)
    val node2 = ListNode(2, node3)
    val node1 = ListNode(1, node2)

//    toToHeadWithIterative(node1)

    tailToHeadWithRecursive(node1)
    list.forEach { print(it) }

}

fun tailToHeadWithRecursive(node: ListNode?) {
    if (node == null) return
    tailToHeadWithRecursive(node.next)
    list.add(node.value)

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

    for (i in 0 until count) {
        list.add(stack.pop())
    }



}