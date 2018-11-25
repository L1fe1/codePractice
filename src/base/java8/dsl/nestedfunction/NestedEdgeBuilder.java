package base.java8.dsl.nestedfunction;

import base.java8.dsl.Edge;
import base.java8.dsl.Vertex;

//Populates the Edge model.
public class NestedEdgeBuilder {
    public static Edge edge(Vertex from, Vertex to,
                            Double weight){
        return new Edge(from, to, weight);
    }

    public static Double weight(Double value){
        return value;
    }
}
