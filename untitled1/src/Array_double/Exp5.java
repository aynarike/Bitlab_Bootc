package Array_double;

import java.util.Scanner;

public class Exp5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr [i] = in.nextInt();
        }
            for (int i = 0; i<n; i++){
                if (i%2==0){
               //     indexzero1 = i;
                }
            }
            for (int i = arr.length -1; i>=0; i--){
                if (arr[i] == 0){
                //    indexzero2 = i;
                }
            }
           // for (int i = indexzero2; i<indexzero1; i++){
               // sum = sum + arr[i];
            }
          //  System.out.println(sum);
     }
// Программа должна вывести сумму всех чисел которые находятся между нулями