package base.java8.dsl;

//Update this according to the package name of your builder
import static base.java8.dsl.nestedfunction.NestedEdgeBuilder.*;
import static base.java8.dsl.nestedfunction.NestedGraphBuilder.*;
import static base.java8.dsl.nestedfunction.NestedVertexBuilder.*;

//嵌套函数
public class NestedGraphDsl {
    public static void main(String[] args) {
        Graph.printGraph(
                Graph(
                        edge(from("a"), to("b"), weight(23.4)),
                        edge(from("b"), to("c"), weight(56.7)),
                        edge(from("d"), to("e"), weight(10.4)),
                        edge(from("e"), to("a"), weight(45.9))
                )
        );

    }
}
