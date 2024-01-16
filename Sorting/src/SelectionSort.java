import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4]; // always define the size of an array while taking user input
        for (int i = 0; i < arr.length; i++) { // here we are taking array from user
            arr[i] = in.nextInt();
        }
        System.out.println("target");
        int target = in.nextInt(); //target as well from user
        selectionSort(arr);
        int ans = linearSearch(arr, target); //external not for selection sort
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);   //external not for selection sort
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length -i -1;                   // this means access array from reverse one and after each time choose -1 element means the next one
            int maxValue = getMax(arr, 0, last);    //function for getting max value from the array
            swap(arr, maxValue, last);                  //this function says swap the max value to the last one
        }
    }
    static int getMax(int[] arr, int start, int end){
       int max = start;
       for(int i = start; i<= end; i++){
           if(arr[max] < arr[i]){
               max = i;

           }
       }return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int linearSearch(int[] arr, int target){ //this can be used after selection sort to find the index no. using linear search
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }

        } return -1;
    }
}
