//Find maximum and minimum element in an array
package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Scanner;

public class Max_Min_Element {

    public static void get_min_max(int arr[], int n)
    {
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]> max)
            {
                max = arr[i];
            }
            if(arr[i]< min)
            {
                min = arr[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        get_min_max(arr, n);
    }
}
