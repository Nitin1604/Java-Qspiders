package allPrograms;

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        char[] a = s1.toCharArray();
        System.out.println("Length is: " + a.length);
    }
    public static int getLength(String s){
        s=s+'\0';
        return s.indexOf('\0');
    }
}
