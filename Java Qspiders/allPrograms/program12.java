package allPrograms;

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        char[] a = s1.toCharArray();
        System.out.println("Length is: " + a.length);
    }
    public static int getLength(String s){
        int length=0;
        try {
        for (int i = 0; ; i++) {
            s.charAt(i);
            length++;
          }
        }
        catch(Exception e){
        }
        return length;
    }
}
