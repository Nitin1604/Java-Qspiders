package allPrograms;

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        char[] a = s1.toCharArray();
        System.out.println("Length is: " + a.length);
    }
}
