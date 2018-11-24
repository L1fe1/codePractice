package base.enumeration;

import java.util.*;

class Clothes{
    private String colorName;
    Color color;

    public Color getColor() {
        return color;
    }

    public Clothes(String colorName, Color color) {
        this.colorName = colorName;
        this.color = color;
    }
}

public class EnumMapDemo {
    public static void main(String[] args) {
        List<Clothes> list = new ArrayList<>();
        list.add(new Clothes("C001", Color.BLUE));
        list.add(new Clothes("C002", Color.YELLOW));
        list.add(new Clothes("C003", Color.RED));
        list.add(new Clothes("C004", Color.GREEN));
        list.add(new Clothes("C005", Color.BLUE));
        list.add(new Clothes("C006", Color.BLUE));
        list.add(new Clothes("C007", Color.RED));
        list.add(new Clothes("C008", Color.YELLOW));
        list.add(new Clothes("C009", Color.YELLOW));
        list.add(new Clothes("C010", Color.GREEN));
        //方案1:使用HashMap
        Map<String, Integer> map = new HashMap<>();
        for (Clothes clothes : list) {
            String colorName = clothes.getColor().name();
            Integer count = map.get(colorName);
            if (count != null) {
                map.put(colorName, count + 1);
            } else {
                map.put(colorName, 1);
            }
        }

        System.out.println(map.toString());

        System.out.println("---------------");

        //方案2:使用EnumMap
        Map<Color, Integer> enumMap = new EnumMap<>(Color.class);

        for (Clothes clothes : list) {
            Color color = clothes.getColor();
            Integer count = enumMap.get(color);
            if (count != null) {
                enumMap.put(color, count + 1);
            } else {
                enumMap.put(color, 1);
            }
        }

        System.out.println(enumMap.toString());
    }

    /**
     输出结果:
     {RED=2, BLUE=3, YELLOW=3, GREEN=2}
     ---------------
     {GREEN=2, RED=2, BLUE=3, YELLOW=3}
     */

}
