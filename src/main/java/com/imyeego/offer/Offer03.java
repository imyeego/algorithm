package com.imyeego.offer;

/**
 * @authur : liuzhao
 * @date : 2020/9/2
 * @time : 下午 2:00
 * @Des :
 */
public class Offer03 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 42}};

        System.out.println(searchMatrix(matrix, 13));
    }


    static boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        int row = matrix.length;
        if (row == 0) return res;
        int col = matrix[0].length;

        // from right-top corner or left-bottom on
        for (int i = 0, j = col - 1; (i >= 0 && i < row) && (j >= 0 && j < col); ) {
            if (matrix[i][j] == target) {
                res = true;
                break;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return res;
    }
}
