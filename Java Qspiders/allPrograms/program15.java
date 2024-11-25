package allPrograms;

public class program15 {
    public static void main(String[] args) {
        String s1 = "mohan";
        s1.intern();
        String s2 = new String("sohan").intern();
        String s3 = "mohan";
        String s4 = "sohan";
        System.out.println(s1 == s3);
        System.out.println(s2 == s4);

    }
}
