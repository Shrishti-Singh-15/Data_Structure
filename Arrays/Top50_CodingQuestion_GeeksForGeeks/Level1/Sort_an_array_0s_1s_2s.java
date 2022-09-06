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
        sortBetter(arr,n);
        sortOptimal(arr,n);
    }

    private static void sortOptimal(int[] arr, int n) {
    }

    private static void sortBetter(int[] arr, int n) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0){
                zeros++;
            }
            if(arr[i] == 1){
                ones++;
            }
            if(arr[i] == 2) {
                twos++;
            }

















        }

    }

    private static void sortBrute(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
