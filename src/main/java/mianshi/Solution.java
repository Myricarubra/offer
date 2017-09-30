package mianshi;

/**
 * Created by zhangdong on 2017/9/30.
 */

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {

    private static int[][] A;

    private static int[][] initArray() {
        int[][] A = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13},
                {6, 8, 11, 15}};
        return A;
    }

    public static boolean Find(int target, int[][] array) {
        if (array != null) {
            int rows = array.length - 1;
            int columns = 0;
            int key;
            boolean find = false;
            while (columns < array[0].length && rows >= 0) {
                key = array[rows][columns];
                if (key == target) {
                    find = true;
                    break;
                } else if (key < target) {
                    columns++;
                } else {
                    rows--;
                }
            }
            if (find) {
                System.out.println("true" + "rows: " + rows + "columns: " + columns);
                return find;
            } else {
                System.out.println("not exists");
                return find;
            }
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        A = initArray();
        System.out.println(A.length);
        System.out.println(A[0].length);
        Find(88,A);
    }
}