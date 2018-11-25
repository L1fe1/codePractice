package base.java8.dsl.lambdabuilder;

import base.java8.dsl.Edge;
import base.java8.dsl.Graph;

import java.util.function.Consumer;

public class GraphBuilder {
    Graph g;
    public GraphBuilder() {
        g = new Graph();
    }

    public static Graph Graph(Consumer<GraphBuilder> gConsumer){
        GraphBuilder gBuilder = new GraphBuilder();
        gConsumer.accept(gBuilder);
        return gBuilder.g;
    }

    public void edge(Consumer<EdgeBuilder> eConsumer){
        EdgeBuilder eBuilder = new EdgeBuilder();
        eConsumer.accept(eBuilder);
        Edge e = eBuilder.edge();
        g.addEdge(e);
        g.addVertice(e.getFromVertex());
        g.addVertice(e.getToVertex());
    }
}
