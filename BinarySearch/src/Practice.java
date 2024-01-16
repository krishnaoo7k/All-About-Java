public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,44,66,78,79,88,89,90,92};
        int target = 4;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }
    static int binarySearch(int[] nums, int target){
        int start , end , mid;
        start = 0;
        end = nums.length -1;
        while(start<=end){
            mid = start + (end - start) /2;

            if(target < nums[mid]){
                end = mid - 1;

            } else if(target > nums[mid]) {
                start = mid + 1;

            }

            else{
                return mid;
            }

        }return -1;
    }
}
