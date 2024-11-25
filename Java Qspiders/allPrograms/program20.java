package allPrograms;

import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c =s1.charAt(i);
//            if (c == ' ')
            if (i==0 && c!= ' ' || c!= ' ' && s1.charAt(i-1)==' ')
                count++;

        }
        System.out.println("Total word count is: " + count);
    }
}
