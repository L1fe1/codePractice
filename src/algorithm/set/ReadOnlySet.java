package algorithm.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReadOnlySet {
    public static void main(String args[ ]) {
        Set<String> set = new HashSet<String>( );
        set.add("Java");
        set.add("JEE");
        set.add("Spring");
        set.add("Hibernate");
        set = Collections.unmodifiableSet(set);
        set.add("Ajax");                                           // not allowed.
    }
}
