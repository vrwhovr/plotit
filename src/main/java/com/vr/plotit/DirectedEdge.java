package com.vr.plotit;

/**
 * Description:
 * <p/>
 * Compilation: {@code javac DirectedEdge.java}
 * <p/>
 * Execution: {@code java DirectedEdge}
 * <p/>
 * Dependencies:
 * <p/>
 * {@author Vijay Ananth}
 * <p/>
 * Email: vijay.hassan@gmail.com
 * <p/>
 * Date: 31/10/14
 */
public class DirectedEdge {
    private final int from;
    private final int to;

    DirectedEdge(int v, int w) {
        from = v;
        to   = w;
    }

    public int from() {
        return from;
    }

    public int  to() {
        return to;
    }
}
