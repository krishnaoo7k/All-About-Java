package StringPrograms;

public class FindEvenUsingString {// example of linear search
    public static void main(String[] args) {
        int[] nums = {12, 345, 67, 890, 1234};
        int count = 0;

        for (int num : nums) {
            String numString = String.valueOf(num);
            int digitCount = numString.length();
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}

