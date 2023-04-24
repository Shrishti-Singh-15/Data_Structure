import java.util.Scanner;

public class Print_first_50_natural_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = 1;
        func(n);
    }
    static void func(int num){
        if(num<=50){
            System.out.print(num + " ");
            func(num + 1);
        }
    }
}
