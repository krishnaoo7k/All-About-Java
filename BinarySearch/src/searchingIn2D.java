//import java.util.Scanner;

import java.util.Arrays;

public class searchingIn2D {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        int[][] arr = {
                {2, 5, 7, 9},
                {3, 6, 8, 10},
                {4, 7, 9, 11},
                {5, 8, 10, 12}

        };
        System.out.println(Arrays.toString(search(arr , 12)));

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
        }
        static int[] search(int[][] arr, int target){
            int r = 0;
            int c = arr.length -1;
            while (r < arr.length && c >= 0) {
                if (arr[r][c] == target) {
                    return new int[]{r, c};
                }
                if (arr[r][c] < target) {
                    r++;
                } else {
                    c--;
                }
            }
            return new int[]{-1, -1};

        }
    }


