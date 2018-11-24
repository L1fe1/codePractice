package base.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class EachWithIndex {

    public interface ItemWithIndexVisitor<E> {
        void visit(E item, int index);
    }

    public static <E> void eachWithIndex(List<E> list, ItemWithIndexVisitor<E> visitor) {
        for (int i = 0; i < list.size(); i++) {
            visitor.visit(list.get(i), i);
        }
    }

    public static <E> void printItem(E value, int index) {
        String output = String.format("%d -> %s", index, value);
        System.out.println(output);
    }

    public static void main(String[] args) {
        List list = Arrays.asList("A", "B", "C");
        eachWithIndex(list,
                (value, index) -> {
                    String output = String.format("%d -> %s", index, value);
                    System.out.println(output);
                }
        );
        eachWithIndex(list,EachWithIndex::printItem);
    }
}
