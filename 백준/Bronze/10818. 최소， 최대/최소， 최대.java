import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = in.nextInt();
        }
        int b = arr[0];
        int s = arr[0];
        for(int j = 0;j<N;j++){
            if(b < arr[j]){
                b = arr[j];
            }
        }
        for(int k = 0;k<N;k++){
            if(s > arr[k]){
                s = arr[k];
            }
        }
        System.out.print(s + " " + b);
        
        in.close();
    }
}