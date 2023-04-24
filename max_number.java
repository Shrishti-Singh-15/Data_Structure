import java.util.Scanner;

public class max_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
//        for(int i=0;i<len;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
        func(arr, len, max, 0);
        System.out.println(max);
    }
    static int func(int arr[], int l, int m, int st){
        if(st<=l) {
            if (arr[st] > m) {
                m = arr[st];
            }
        }
        func(arr, l, m, st+1);
        return m;
    }
}
