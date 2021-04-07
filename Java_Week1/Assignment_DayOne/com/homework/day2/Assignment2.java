package com.homework.day2;

public class Assignment2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7}, {8,9}, {0}};
        findMax(arr);
    }

    /**
     * Prints out the largest value in a 2D array and the position
     * in one indexed (i,j) format
     * @param arr - 2d array of integers
     */
    public static void findMax(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int i_pos = 0;
        int j_pos = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    i_pos = i + 1; // Convert to 1 index
                    j_pos = j + 1;
                }
            }
        }
        System.out.println("The largest number is: " + max
                + " and it's located at (" + i_pos + "," + j_pos + ")");
    }

}
