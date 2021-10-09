package Week3;

import java.util.*;

public class BinarySearch {
    public static int binarySearch(int arr[], int begin, int end, int number) {
        if(begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (arr[mid] == number) return mid;
            else if (arr[mid] > number) {
                return binarySearch(arr, begin, mid - 1, number);
            } else if (arr[mid] < number) {
                return binarySearch(arr,  + 1, end, number);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,arr.length - 1,x));
    }
}