import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[9];
        for(int i = 0;i<9;i++){
            arr[i] = in.nextInt();
        }
        int a = arr[0];
        int p = 0;
        for(int j = 0;j<9;j++){
            if(a <= arr[j]){
                a = arr[j];
                p = j+1;
            } 
        }
        System.out.println(a);
        System.out.println(p);
}
}