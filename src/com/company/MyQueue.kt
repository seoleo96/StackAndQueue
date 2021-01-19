package com.company

import java.util.*

class MyQueue {

    /** Initialize your data structure here. */
    private val stack = Stack<Int>()
    private val stackHelper = Stack<Int>()
    private var size = 0;


    /** Push element x to the back of queue. */
    fun push(x: Int) {
        if (stack.empty()) {
            stackHelper.push(x)
            size++
        } else {
            pushStackToStackHelper()
            stackHelper.push(x)
            size++
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        copyStack()
        size--
        return stack.pop()
    }

    /** This fun helps to copy all elements to Stack. */
    private fun copyStack() {
        while (!stackHelper.isEmpty()) {
            stack.push(stackHelper.pop())
        }
    }

    /** This fun helps to push all elements to stackHelper. */
    private fun pushStackToStackHelper() {
        while (!stack.isEmpty()) {
            stackHelper.push(stack.pop())
        }
    }

    /** Get the front element. */
    fun peek(): Int {
        copyStack()
        return stack.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty() = size == 0


    /** Returns size of the queue. */
    fun size() = size

    /** Returns all elements of the queue. */
    override fun toString(): String {
        copyStack()
        return stack.toString()
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */