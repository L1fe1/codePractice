package algorithm.array;

import java.util.Arrays;

public class InsertingElementsToUnsortedArray {
    public static void insertUnsortedArray(String toInsert) {

        String[ ] unsortedArray = { "A", "D", "C" };

        String[ ] newUnsortedArray = new String[unsortedArray.length + 1];
        System.arraycopy(unsortedArray, 0, newUnsortedArray, 0, 3);
        newUnsortedArray[newUnsortedArray.length - 1] = toInsert;
        System.out.println(Arrays.toString(newUnsortedArray));
    }

    public static void main(String[ ] args) {
        insertUnsortedArray("B");
    }
}
