package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        subarrayWithGivenSum(arr, n, sum);
    }

    private static void subarrayWithGivenSum(int[] arr, int n, int sum) {
        int currsum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            currsum += arr[i];
            if(currsum - sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(currsum - sum)){
                start = map.get(currsum - sum) + 1;
                end = i;
                break;
            }
            map.put(currsum, i);
        }
        if(end == -1){
            System.out.println(-1);
        }
        else{
            int start1 = start + 1;
            int end1 = end + 1;
            System.out.println(start1 + " " + end1);
        }
    }
}
