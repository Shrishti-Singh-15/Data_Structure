//sum of number ranging from 1 to n

import java.util.Scanner;

public class Sum_1_to_n {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: - ");
        int num = sc.nextInt();
        int out = func(num);
        System.out.println(out);
    }

    static int func(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return (n + func(n-1));
        }
    }
}
