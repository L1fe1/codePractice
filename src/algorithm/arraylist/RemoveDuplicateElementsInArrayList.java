package algorithm.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateElementsInArrayList {
    public <e> List<e> function (List <e> list) {
        return new ArrayList<e>(new LinkedHashSet<e>(list));
    }
}
