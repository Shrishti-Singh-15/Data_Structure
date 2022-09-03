package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Scanner;

public class Peak_Element {
    public static int peakutil(int arr[], int low, int high, int n)
    {
        int mid = (low+high)/2;
        if((mid == 0 || arr[mid-1]<=arr[mid]) && (mid == n-1 || arr[mid+1]<=arr[mid])){
            return mid;
        }
        else if(mid>0 && arr[mid-1]>arr[mid])
        {
            return peakutil(arr, low, mid-1, n);
        }
        else {
            return peakutil(arr, mid+1, high, n);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(peakutil(arr, 0, n-1, n));
    }

}
