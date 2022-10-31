package String;

import java.util.Scanner;

public class s6_14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] perevod = word.toCharArray();
        String vowels = "aeuyio";
        int count = 0;
        for (int i = 0; i < perevod.length; i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))){
                    count++;
                }
        }
        System.out.println(count);
    }
}

//char[] vowels = {'a', 'e', 'i', 'o', 'u'};
      //for (int i = 0; i < perevod.length; i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (perevod[i] == vowels[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);