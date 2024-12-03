package allPrograms;

import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String res = sc.nextLine();
        String revStr = reverseWord(res);
        System.out.println(revStr);
    }
    public static String reverseWord(String s){
        String word = "";
        String res= "";
        for (int i = s.length() -1;i>=0;i--){
            char c = s.charAt(i);
            if (c!=' ')
                word+= c;
            if ((c!=' ' || i==0) && !word.isBlank()){
                res+=" " + word;
                word="";
            }
        }
        return res.strip();
    }
}
