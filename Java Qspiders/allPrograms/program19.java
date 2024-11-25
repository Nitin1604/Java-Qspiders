package allPrograms;

import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s1 = sc.nextLine();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c>='0' && c <=57){
                System.out.println(c);
                count++;
                sum+=c-48;
            }

        }
        System.out.println("Sum is: "+ sum);
        System.out.println("Count is: "+ count);
    }
}
