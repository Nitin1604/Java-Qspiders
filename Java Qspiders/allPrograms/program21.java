package allPrograms;

public class program21 {
    public static void main(String[] args) {
        String s1 = "mohan";
        String s2 = "Mohan";
        System.out.println("indexOf of  S1 is: " + s1.indexOf("h"));
        System.out.println("compareToIgnoreCase of S1 is: " +s1.compareToIgnoreCase(s2));
        System.out.println("startsWith of S1 is: " + s1.startsWith("mo"));
        System.out.println("startsWith of S1 with index 2 ex1: " +s1.startsWith("mo",2));
        System.out.println("startsWith of S1 with index 2 ex2: " + s1.startsWith("han",2));

        String s3 = "mohan and sohan and rohan";
        System.out.println("indexOf s3 is: " + s3.indexOf('a'));
        System.out.println("indexOf of s3 from index 14: " + s3.indexOf('a',14));
        System.out.println("lastIndexOf of s3: " + s3.lastIndexOf('a'));
        System.out.println("lastIndexOf of s3 from index 10: " + s3.lastIndexOf('a',10));
        System.out.println("lastIndexOf of p: " +s3.lastIndexOf('p'));
    }
}
