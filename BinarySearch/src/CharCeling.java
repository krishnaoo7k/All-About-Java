public class CharCeling {
    public static void main(String[] args) {
        char[] arr = {'a','c','e','h','k','n','p','s','v','x'};
        char target = 'd';
        char ans = charCeling(arr,target);
        System.out.println(ans);
    }
    static char charCeling(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
//        if(target > end){
//            return arr[0];
//        }
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
//            if(start == end) {
//                return arr[0];
//            }
        }
        return arr[start % arr.length];
    }

}
