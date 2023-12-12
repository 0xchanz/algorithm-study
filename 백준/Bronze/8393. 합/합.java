import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        
        for(int i = 1;i<n+1;i++){
            p += i;
        }
        System.out.print(p);
        
        in.close();
    }
}