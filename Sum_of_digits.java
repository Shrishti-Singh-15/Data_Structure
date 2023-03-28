//Sum of digits of a number

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: - ");
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
            return ((n%10) + func(n/10));
        }

    }
}
