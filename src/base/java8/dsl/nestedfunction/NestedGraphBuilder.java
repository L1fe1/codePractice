package base.java8.dsl.nestedfunction;

import base.java8.dsl.Edge;
import base.java8.dsl.Graph;

//Populates the Graph model.
public class NestedGraphBuilder {
    public static Graph Graph(Edge... edges){
        Graph g = new Graph();
        for(Edge e : edges){
            g.addEdge(e);
            g.addVertice(e.getFromVertex());
            g.addVertice(e.getToVertex());
        }
        return g;
    }
}
