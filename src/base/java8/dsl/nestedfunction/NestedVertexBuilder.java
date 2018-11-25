package base.java8.dsl.nestedfunction;

import base.java8.dsl.Vertex;

//Populates the Vertex model.
public class NestedVertexBuilder {
    public static Vertex from(String lbl){
        return new Vertex(lbl);
    }

    public static Vertex to(String lbl){
        return new Vertex(lbl);
    }
}
