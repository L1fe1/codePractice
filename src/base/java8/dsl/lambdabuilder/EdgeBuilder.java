package base.java8.dsl.lambdabuilder;

import base.java8.dsl.Edge;
import base.java8.dsl.Vertex;

import java.util.function.Consumer;

public class EdgeBuilder {
    Edge e;
    public EdgeBuilder() {
        e= new Edge();
    }

    public Edge edge(){
        return e;
    }

    public void from(String lbl){
        e.setFromVertex(new Vertex(lbl));
    }

    public void to(String lbl){
        e.setToVertex(new Vertex(lbl));
    }

    public void weight(Double w){
        e.setWeight(w);
    }
}
