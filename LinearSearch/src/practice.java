//public class practice {
//    public static void main(String[] args) {
//        int[] arr = {1,33,4,5,6,7,77,6,5,4,77};
//        int target = 77;
//        int ans = search(arr , target);
//        System.out.println(ans);
//        System.out.println(min(arr));
//
//    }
//    static int search(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//            for(int i = 0; i <arr.length; i++){
//                if(arr[i] == target) {
//                    return i;
//                }
//            }
//        return -1;
//    }
//    static int min(int[] arr){
//        int ans = arr[0];
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i]<ans){
//                ans = arr[i];
//
//            }
//
//        }return ans;
//    }
//
//}

import java.util.Arrays;

public class practice{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,45,5},
                {4,5,77,8,9},
                {6,2,8,0}
        };
        int target = 100;
        System.out.println(Arrays.toString(search (arr, target)));

    }
    static int[] search(int[][] arr, int target){
        for(int r = 0; r< arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(arr[r][c] == target){
                    return new int[]{r, c};
                }
            }
        }return new int[]{-1,-1};
    }
}
