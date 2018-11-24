package algorithm.string;

public class Reverser {
    public String jdkReverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return new StringBuffer(str).reverse().toString();
    }
    public String recursionReverse(String str) {
        if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
        return recursionReverse(str.substring(1)) + str.charAt(0);
    }
    public String stringbufferReverse(String str) {
        if ((null == str) || (str.length()  <= 1 )) {
            return str;
        }
        StringBuffer result = new StringBuffer(str);
        for (int i = 0; i < (str.length() / 2); i++) {
            int swapIndex = str.length() - 1 - i;
            char swap = result.charAt(swapIndex);
            result.setCharAt(swapIndex, result.charAt(i));
            result.setCharAt(i, swap);
        }
        return result.toString();
    }
    public String appendReverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        StringBuffer reverse = new StringBuffer(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}
