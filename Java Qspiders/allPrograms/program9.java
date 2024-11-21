package allPrograms;

public class program9 {
    public static void main(String[] args) {
        String s1 = new String("mohan");
        String s2 = new String("johan");
        String s3 = "mohan";
        String s4 = new String("mohan");
        s2 = "mohan";
        String s5 = new String("johan");
        String s6 = s4;
        String s7 = s3;
        String s8 = new String("mohan");
        String s9 = "john";
        String s10 = s8 + s1;
        String s11 = "mohan";
        s9 = new String("john");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
        System.out.println("s6: " + s6);
        System.out.println("s7: " + s7);
        System.out.println("s8: " + s8);
        System.out.println("s9: " + s9);
        System.out.println("s10: " + s10);
        System.out.println("s11: " + s11);

        System.out.println("Expression1: " + s1 == s3);
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("Expression2: " + s3 == s11);
        System.out.println("s3.equals(s11): " + s3.equals(s11));
        System.out.println("Expression3: " + s9 == s5);
        System.out.println("s9.equals(s5): " + s9.equals(s5));
        System.out.println("Expression4: " + s4 == s6);
        System.out.println("s4.equals(s6): " + s4.equals(s6));
        System.out.println("Expression5: " + s1 == s4);
        System.out.println("s1.equals(s4): " + s1.equals(s4));

    }
}
