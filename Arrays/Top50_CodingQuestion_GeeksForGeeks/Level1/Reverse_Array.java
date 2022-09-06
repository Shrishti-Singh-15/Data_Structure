//Reverse the array
package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
