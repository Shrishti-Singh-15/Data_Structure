package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.ArrayList;
import java.util.Scanner;

public class Move_All_Negative_Element_To_End {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        solOptimal(arr, n);
    }
    private static void solOptimal(int[] arr, int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ls.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ls.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = ls.get(i);
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
