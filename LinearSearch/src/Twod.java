//public class Twod {
//    public static void main(String[] args) {
//        int[][] list = {
//                {1, 2, 3},
//                {3, 6, 9, 0},
//                {2, 1, 44, 22},
//                {33, 55, 99, 89}
//        };
//        for(int row = 0 ; row<list.length; row++){
//            for(int col = 0; col<list[row].length; col++){
//                System.out.print(list[row][col] +" ");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Arrays;

public class Twod {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 12;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        //System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {   //find maximum in 2d array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];
            for (int j = 0; j < temp.length; j++) {
                int element = temp[j];
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}