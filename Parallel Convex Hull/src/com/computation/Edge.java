package com.computation;

/**
 * Created by Mathew on 11/4/2014.
 */
public class Edge {

    public final Point p1;
    public final Point p2;

    public Edge(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Edge(Edge edge) {
        this(edge.p1, edge.p2);
    }

    @Override
    public int hashCode() {
        return new Integer(p1.hashCode() + p2.hashCode()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Edge) {
            Edge edge = (Edge) obj;
            return (edge.p1.equals(p2) && edge.p2.equals(p1)) || (edge.p1.equals(p1) && edge.p2.equals(p2));
        }

        return false;
    }
}
