package algorithm.array;

/**
 * 有一组数字，从0到n，其中减少了x个数，顺序也被打乱，放在一个n-x的数组里，请找出丢失的数字。
 */
public class FindLostDataInArray {
    public static String lostData(int[] a,int n){
        String result = "";
        int b[] = new int[n+1];
        for (int i = 0;i < a.length;i ++){
            b[a[i]] = 1;
        }
        for (int i = 0;i < b.length;i ++){
            if (b[i] != 1){
                result += i + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,2,6,8,9};
        System.out.println(lostData(a,10));
    }
}
