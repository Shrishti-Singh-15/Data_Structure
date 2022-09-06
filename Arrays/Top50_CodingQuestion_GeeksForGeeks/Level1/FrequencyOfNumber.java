package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        frequency(arr, n, x);
    }
    private static void frequency(int[] arr, int n, int x) {
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }

}
