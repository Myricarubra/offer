package algs4.sort;


/**
 * Created by zhangdong on 2017/12/9.
 */
public class QuickSort extends Example {
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partiton(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partiton(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
//                if (i >= hi) {
//                    break;
//                }
            }
            while (less(v, a[--j])) {
//                if (j <= lo) {
//                    break;
//                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        String[] a = {"k", "33", "1", "v", "f", "hgh"};
        sort(a);
        show(a);
    }
}
