package com.company

class MainClass {
}

private val dip = 1..30 step 1

fun main() {

//    val queue = MyQueue()
//    println(queue.empty())
//    queue.push(1)
//    queue.push(2)
//    queue.push(3)
//    println(queue.peek())
//    queue.push(4)
//    queue.push(5)
//    println(queue)
//    println(queue.empty())
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.size())
//    println(queue)
//    queue.push(6)
//    queue.push(7)
//    queue.push(8)
//    queue.push(9)
//    println(queue.size())
//    println(queue.peek())
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.pop())
//    println(queue.size())
//    println(queue)
//    println(queue.peek())
//    queue.push(10)
//    queue.push(11)
//    queue.push(12)
//    queue.push(13)
//    println(queue.peek())
//    println(queue.size())
//    println(queue.pop())
//    println(queue.size())
//    println(queue)
//    val dip = 1 until 4
//    dip.forEach {
//        println(it)
//    }


    val stack = MyStack()
    println(stack.empty())
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    println(stack)
    println(stack.empty())
    println(stack.top())
    println(stack.pop())
    println(stack.pop())
    println(stack)
    stack.push(5)
    stack.push(6)
    stack.push(7)
    stack.push(8)
    println(stack.top())
    println(stack)
    println(stack.pop())
    println(stack.pop())
    println(stack)
    println(stack.top())


}