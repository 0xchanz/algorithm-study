import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int c;
        int d;
        int e;
        int f;
        
        f = A*B;
        c = B/100;
        B = B - (c*100);
        d = B/10;
        B = B - (d*10);
        e = B;
        
        System.out.println(A*e);
        System.out.println(A*d);
        System.out.println(A*c);
        System.out.println(f);
        
        in.close();
    }
}