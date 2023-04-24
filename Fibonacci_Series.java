import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println(func(i));
        }
    }
    static int func(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1 || num ==2){
            return 1;
        }
        return func(num-2) + func(num-1);
    }

}
