public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,44,66,78,79,88,89,90,92};
        int target = 44;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start , end , mid;
        start = 0;
        end = arr.length -1;
        while(start<=end){
            mid = start + (start - end)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } if else(target > arr[mid]){
                start = mid + 1;
                else{
                    return mid;
                }
            }
        }
    }
}
