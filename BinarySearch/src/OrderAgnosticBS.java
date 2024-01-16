public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {100000, 20000, 3000, 400, 59, 56, 47, 38, 12, 8, 7, 6, 5, 3, 2, 1};
        int target = 20000;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr, int target) {
        int start, end, mid;
        start = 0;
        end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}