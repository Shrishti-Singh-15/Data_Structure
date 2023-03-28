//Find factorial of a number

import java.util.Scanner;
public class Factorial_of_a_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial needs to be calculated: - ");
        int num = sc.nextInt();
        int out = fact(num);
        System.out.println(out);
    }
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
