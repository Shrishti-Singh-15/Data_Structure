import java.util.Scanner;

public class Print_Array_elements {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        func(arr, 0, num);
    }
    static void func(int a[], int st, int len){
        if(st >= len){
            return;
        }

        System.out.println(a[st] + " ");
        func(a, st+1, len);
    }

}
