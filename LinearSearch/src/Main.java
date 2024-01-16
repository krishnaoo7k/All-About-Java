public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,7,7,88,99,33,55,66};   // linear search to find a target in array
        int target = 2;
        int ans = LinearSearch(nums, target, 1,3); //here we applied a range as well
        System.out.println("index "+ans);
    }
    static int LinearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index<end; index++){
            if(arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}

//public class Main{
//    public static void main(String[] args) {
//        String name = "krishna";
//        char target = 'i';
//        boolean ans =  findChar(name  , target);  //return a string char
//        System.out.println(ans);
//
//    }
//    static boolean findChar(String str , char target) {
//        if (str.length() == 0) {
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target ){
//                return true;
//            }
//
//        }
//        return false;
//    }
//}

//public class Main{                                 // in this program smallest no. is printing
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,67,65,6,8,99,80,0};
//        System.out.println(min(arr));
//    }
//    static int min(int[] arr){
//        int ans = arr[0]; //here initially ans was the first index
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < ans){    //if arr is less than ans  then update it
//                ans = arr[i];    //here it is updating if its smaller then ans
//            }
//        }
//        return ans;
//    }
//
//}