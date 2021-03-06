package com.d04nhtu.dsa.data_structures.stacks

import com.d04nhtu.dsa.data_structures.lists.Node


class StackByLinkedList<T : Comparable<T>>() {

    private var head: Node<T>? = null
    private var numElements: Int = 0

    fun push(value: T) {
        val newNode = Node(value)

        if (head == null) {
            head = newNode
        } else {
            newNode.next = head
            head = newNode
        }

        numElements++
    }

    fun pop(): T? {
        return if (isEmpty()) {
            null
        } else {
            val value = head!!.value
            head = head!!.next
            numElements -= 1
            value
        }
    }

    fun peek(): T? {
        return head?.value
    }

    fun size() = numElements

    private fun isEmpty() = numElements == 0
}
