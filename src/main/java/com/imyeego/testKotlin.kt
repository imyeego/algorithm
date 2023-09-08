package com.imyeego

import com.imyeego.leetcode.TreeNode
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

fun main() {
    val treeNode: TreeNode? = null
    val s = "liuzhao"

    println(s)

    testDynamicProxy()
}

fun testDynamicProxy() {
    val proxy = AddOperation()

    val interfaces = arrayOf(OperationInterface::class.java)
    val interfaceProxy = Proxy.newProxyInstance(OperationInterface::class.java.classLoader, interfaces, OperationImplProxyHandler(proxy)) as OperationInterface

    println(interfaceProxy.add(2, 3))
}

interface OperationInterface {
    fun add(a: Int, b: Int): Int
}

class AddOperation: OperationInterface {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }
}

class OperationImplProxyHandler(private val target: Any): InvocationHandler {
    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>): Any {
        println("调用函数: ${method.name}")
        return method.invoke(target, *args)
    }
}