public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
        int target = 21;
        int ans = findCeiling(arr , target);
        System.out.println(ans);
    }
    static int findCeiling(int[] arr, int target){
        int start, end, mid ;
        start = 0;
        end = arr.length -1;
        while(start <= end){ // here when loop  condition violated then start become greater than end and start shifts
                            // after the mid that's why when we print return start it will print the next no. after mid
                            //  that become start
            mid = start + (end - start)/2 ;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }return start; // this will print the next no if the target doesn't exist.
    }
}