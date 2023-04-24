import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str[] =  new String[num];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        func(str, str.length, 0);
    }
    static void func(String str[], int len, int st){
        if(len >= st){
            return;
        }
        System.out.print(str[len]);
        func(str, len-1, st);
    }
}
