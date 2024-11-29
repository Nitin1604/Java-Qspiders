package allPrograms;

import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        reverseWord(s1);
    }
    public static void reverseWord(String s){
        String word = "";
        for (int i = s.length() -1;i>=0;i--){
            char c = s.charAt(i);
            if (c!=' ')
                word+= c;
            if ((c!=' ' || i==0) && !word.isBlank()){
                System.out.print(word+ " ");
                word="";
            }
        }

    }
}
