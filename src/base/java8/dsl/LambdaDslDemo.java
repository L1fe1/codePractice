package base.java8.dsl;

import static base.java8.dsl.lambdabuilder.GraphBuilder.*;

public class LambdaDslDemo {
    public static void main(String[] args) {
        Graph g1 = Graph( g -> {
            g.edge( e -> {
                e.from("a");
                e.to("b");
                e.weight(12.4);
            });

            g.edge( e -> {
                e.from("c");
                e.to("d");
                e.weight(13.4);
            });
        });

        Graph.printGraph(g1);
    }
}
