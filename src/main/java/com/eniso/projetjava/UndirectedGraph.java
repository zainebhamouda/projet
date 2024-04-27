/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;

/**
 *
 * @author zaine
 */
import java.util.ArrayList;

public class UndirectedGraph extends Graph {

    public UndirectedGraph() {
        super();
    }

    @Override
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[getVertices().size()];
        ArrayList<Integer> queue = new ArrayList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.remove(0);
            System.out.print(currentVertex + " ");

            for (int neighbor : getEdges().get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    @Override
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[getVertices().size()];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");

        for (int neighbor : getEdges().get(currentVertex)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}

