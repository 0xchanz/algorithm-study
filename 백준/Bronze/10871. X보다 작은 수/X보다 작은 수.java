import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        
        int arr[] = new int[N];
        
        for(int j = 0;j<N;j++){
            arr[j] = in.nextInt();
        }
        
        
        for(int i = 0;i<N;i++){
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
        in.close();
    }
}