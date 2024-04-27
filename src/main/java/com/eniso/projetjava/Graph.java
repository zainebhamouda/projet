/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author zaine
 */
public abstract class Graph {
    private List<Integer> vertices;
    private Map<Integer, List<Integer>> edges;
    
    
    public Graph(){
         this.vertices = new ArrayList<>();
         this.edges = new HashMap<>();

      }

    public List<Integer> getVertices() {
        return vertices;
    }

    public Map<Integer, List<Integer>> getEdges() {
        return edges;
    }

    public void setVertices(List<Integer> vertices) {
        this.vertices = vertices;
    }

    public void setEdges(Map<Integer, List<Integer>> edges) {
        this.edges = edges;
    }
    
     // Méthode pour ajouter un sommet au graphe
    public void addVertice(int v) {
        vertices.add(v);
        edges.put(v, new ArrayList<>());
    }

    // Méthode pour ajouter une arête au graphe
    public void addEdge(int v1, int v2) {
        edges.get(v1).add(v2);
        edges.get(v2).add(v1);
    }

    // Méthode pour afficher le graphe
    public void printGraph() {
        for (int v : vertices) {
            System.out.print(v + " : ");
            for (int voisin : edges.get(v)) {
                System.out.print(voisin + " ");
            }
            System.out.println();
        }
    }
    
     // Méthode abstraite pour parcourir le graphe en largeur
    public abstract void BFS(int startVertex);

    // Méthode abstraite pour parcourir le graphe en profondeur
    public abstract void DFS(int startVertex);
}
