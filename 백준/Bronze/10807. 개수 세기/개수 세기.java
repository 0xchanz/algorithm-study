import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int p = 0;
        int line[] = new int[N];
        for(int i = 0;i<N;i++){
            line[i] = in.nextInt();
        }
        int c = in.nextInt();
        for(int j = 0;j<N;j++){
            if(line[j] == c){
            p++;
        }
        }
        System.out.print(p);
    }
}