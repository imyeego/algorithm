package com.imyeego.offer

import java.util.*

/**
 *
 * @authur : liuzhao
 * @date : 12/10/20:2:39 PM
 * @des  : 两个栈构造队列
 */
fun main() {

    var queue = Queue()

    queue.enqueue(5)
    queue.enqueue(4)
    print(queue.dequeue())
    queue.enqueue(3)
    print(queue.dequeue())
    queue.enqueue(6)

    print(queue.dequeue())
    print(queue.dequeue())

}


class Queue {
    var s1: Stack<Int> = Stack()
    var s2: Stack<Int> = Stack()

    fun enqueue(e: Int) {
        s1.push(e)

    }

    fun dequeue() : Int? {

        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop())
            }

        }

        return s2.pop()

    }

    fun empty(): Boolean {
        return s1.empty() && s2.empty()
    }
}