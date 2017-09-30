package algs4;

import java.util.Arrays;

/**
 * Created by zhangdong on 2017/8/22.
 */
public class BinarySeach {
    public static void main(String[] args) {
        int[] a = {13,32,43,15,16,112,33,35,345,77,123,456,777};
        printArr(a);
        int rs = rank(3333,a);
        System.out.println(rs);
    }

    public static int rank(int key ,int[] a){
        Arrays.sort(a);
        printArr(a);
        int lo = 0;
        int hi = a.length - 1;
//        int mid = lo + (hi - lo) / 2;
        int j = 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]){
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else return mid;
        }
        return -1;
    }

    public static void printArr(int[] a){
        System.out.print("[");
        for (int i = 0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
        System.out.println("]");
    }
}
