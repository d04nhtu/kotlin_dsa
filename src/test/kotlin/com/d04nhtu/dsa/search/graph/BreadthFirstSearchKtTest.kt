package com.d04nhtu.dsa.search.graph

import org.junit.jupiter.api.Test

internal class BreadthFirstSearchKtTest {

    @ExperimentalStdlibApi
    @Test
    fun breadthFirstSearch() {
        val nodeG = GraphNode('G')
        val nodeR = GraphNode('R')
        val nodeA = GraphNode('A')
        val nodeP = GraphNode('P')
        val nodeH = GraphNode('H')
        val nodeS = GraphNode('S')

        val graph1 = Graph(listOf(nodeS, nodeH, nodeG, nodeP, nodeR, nodeA))
        graph1.addEdge(nodeG, nodeR)
        graph1.addEdge(nodeA, nodeR)
        graph1.addEdge(nodeA, nodeG)
        graph1.addEdge(nodeR, nodeP)
        graph1.addEdge(nodeH, nodeG)
        graph1.addEdge(nodeH, nodeP)
        graph1.addEdge(nodeS, nodeR)

        assert(nodeA == breadthFirstSearch(nodeS, 'A'))
        assert(nodeS == breadthFirstSearch(nodeP, 'S'))
        assert(nodeR == breadthFirstSearch(nodeH, 'R'))
    }
}