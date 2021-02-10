package com.company

import java.util.*

class MyStack {

    /** Initialize your data structure here. */
    private var queue: Queue<Int> = LinkedList<Int>()
    private var queueHelper: Queue<Int> = LinkedList<Int>()
    private var size = 0

    /** Push element x onto stack. ------- */
    fun push(x: Int) {
        queueHelper.add(x)
        size++
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        pushAllElementsQueueHelperToQueue()
        val temp: Int = queueHelper.poll()
        size--
        copyElementsQueueHelperToQueue()
        return temp
    }


    private fun pushAllElementsQueueHelperToQueue() {
        val dip = 1 until size
        dip.forEach {
            queue.add(queueHelper.poll())
        }
    }

    private fun copyElementsQueueHelperToQueue() {
        val temp: Queue<Int> = queueHelper
        queueHelper = queue
        queue = temp
    }

    /** Get the top element. */
    fun top(): Int {
        pushAllElementsQueueHelperToQueue()
        val temp = queueHelper.poll()
        queue.add(temp)
        copyElementsQueueHelperToQueue()
        return temp
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return queue.isEmpty() && queueHelper.isEmpty();
    }


    /** Prints all elements of stack. */
    override fun toString(): String {
        return queueHelper.reversed().toString()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */