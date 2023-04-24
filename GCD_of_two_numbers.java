import java.util.Scanner;

public class GCD_of_two_numbers {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD(a,b);
        GCD(a,b);
        int out = findGCD(a, b);
        System.out.println(out);
    }
    static  void GCD(int a, int b){
        int g = 0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        System.out.println(g);
    }

    static void GCD2(int a, int b){
        while(a%b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println(b);
    }

    static int findGCD(int a, int b){
        if(a%b == 0){
            return b;
        }
        else{
            return findGCD(b, a%b);
        }
    }
}
