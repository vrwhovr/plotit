package com.vr.plotit;

import java.util.ArrayList;

/**
 * Description:
 * <p/>
 * Compilation: {@code javac Graph.java}
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
public interface Graph {
    public int V();
    public int E();

    public Iterable adj(int v);
    public void addEdge(int  v, int w);
    public void addEdge(String  source, String target);
}