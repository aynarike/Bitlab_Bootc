package Array;

import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = -1;
        int[] nums = new int[n];
        for (int i = 0; i< nums.length; i ++){
            nums [i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int i = 0; i< nums.length; i++) {
            if (nums[i]==m) {
                index = i;
                break;
            }
        }
        if (index==-1)
            System.out.println("NO");
        else
            System.out.println("YES" + "\n" + index);
    }
}
// Если число m существует в нашем массиве,
// программа должна вывести слово "YES" и вывести индекс (расположение, адрес) данного числа. Иначе вывести слово "NO".