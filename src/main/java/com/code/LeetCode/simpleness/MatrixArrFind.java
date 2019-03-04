package com.code.LeetCode.simpleness;

/**
 * @Description 二维数组查找问题
 * @ClassName MatrixArrFind
 * @Author Liumh
 * @Date 2019/2/12 9:33
 * @Version v1.0
 */
public class MatrixArrFind {

    public static void main(String[] args){
        int[][] matrix = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        find(4, matrix);
    }

    private static boolean find(int target, int[][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        //从右上角开始对比[也可以从其余三个角作为起始对比点]
        int r = 0, c = cols - 1;
        while ( r < rows && cols > 0){
            if (target == matrix[r][c]){
                System.out.println("rows: "+ r +" cols: "+c);
                return true;
            }
            if (target > matrix[r][c]){
                r++;
            }
            if (target < matrix[r][c]){
                c--;
            }
        }
        return false;
    }
}
