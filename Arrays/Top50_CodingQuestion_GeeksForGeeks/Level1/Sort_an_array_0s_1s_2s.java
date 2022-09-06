package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_an_array_0s_1s_2s {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sortBrute(arr, n);
        sortOptimal(arr,n);
    }

    private static void sortOptimal(int[] arr, int n) {
        int low = arr[0];
        int mid = arr[0];
        int high = arr[n-1];
        while(mid<=high){
            switch(arr[mid]){
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sortBrute(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
