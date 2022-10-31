package Java_core_metod1_1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i< arr.length; i++){
            arr [i] = in.nextInt();
        }
        System.out.println(Ainara(n, arr));
    }
    public static int Ainara (int n, int arr[]){
        int sum = 0;
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]%2==0){
                count = count + arr[i];
                sum = sum + 1;
            }
        }
        return count/sum;
    }
}