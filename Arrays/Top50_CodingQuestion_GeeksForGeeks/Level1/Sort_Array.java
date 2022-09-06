//Sort an array
package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sorted_array_predefined(arr, n);
        sorted_array(arr, n);
    }

    private static void sorted_array_predefined(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void sorted_array(int[] arr, int n) {
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
