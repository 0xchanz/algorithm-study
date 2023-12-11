import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        
        if(M-45 < 0){
            M = 60+(M-45);
            H--;
            if(H < 0){
                H = 24 + H;
            }
        }else{
            M -= 45;
        }
        System.out.println(H+" "+M);
        in.close();
    }
}