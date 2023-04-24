import java.util.Scanner;

public class count_no_of_digits_in_a_number {
    static int c = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int out = func(num);
        System.out.println(out);
    }
    static int func(int n){

        if(n!=0){
            c = c+1;
            func(n/10);
        }
        return c;
    }
}
