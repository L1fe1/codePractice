package base.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApi {
    public static void main(String[] args) {
        NavigableMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 10; i++)
            map.put(i, i);

        assert map.lowerEntry(6).getKey() == 5;
        assert map.lowerEntry(5).getKey() == 4;
        assert map.lowerEntry(0).getKey() == null;
    }
}
