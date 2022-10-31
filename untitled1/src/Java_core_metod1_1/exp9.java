package Java_core_metod1_1;

import java.util.Scanner;

public class exp9 {
    public static void main (String[]arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr [i] = in.nextInt();
        }
        Ainara(n, arr);
    }
    public static void Ainara (int n, int arr[]){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == 23){
                break;
            } if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}