package Top50_CodingQuestion_GeeksForGeeks.Level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest_Element {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ksmallest(arr, n, k);
    }

    private static void ksmallest(int[] arr, int n, int k) {
//        Arrays.sort(arr);
//        System.out.println(arr[k-1]);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            priorityQueue.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(priorityQueue.peek() > arr[i]){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        System.out.println(priorityQueue.peek());
    }
}
