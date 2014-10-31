package com.vr.plotit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * <p/>
 * Compilation: {@code javac DependencyGraph.java}
 * <p/>
 * Execution: {@code java DependencyGraph}
 * <p/>
 * Dependencies:
 * <p/>
 * {@author Vijay Ananth}
 * <p/>
 * Email: vijay.hassan@gmail.com
 * <p/>
 * Date: 31/10/14
 */
public class DependencyGraph implements Graph {
    private int V;
    private int E;
    private Map<String, Integer> vertexMap;

    private ArrayList<DirectedEdge>[] adj;

    public DependencyGraph(int v) {
        vertexMap = new HashMap<String, Integer>();
        V = v;
        adj = (ArrayList<DirectedEdge>[]) new  ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<DirectedEdge>();
        }
    }

    @Override
    public int V() {
        return V;
    }

    @Override
    public int E() {
        return E;
    }

    @Override
    public Iterable adj(int v) {
        return adj[v];
    }

    @Override
    public void addEdge(int v, int w) {
        E++;
        adj[v].add(new DirectedEdge(v, w));
    }

    @Override
    public void addEdge(String source, String target) {
        Integer v = vertexMap.get(source);
        Integer w = vertexMap.get(target);

        if (v==null) {
            v = vertexMap.size();
            vertexMap.put(source, v);
        }

        if (w==null) {
            w = vertexMap.size();
            vertexMap.put(target, w);
        }

        addEdge(v,w);
    }
}
