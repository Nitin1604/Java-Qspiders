package allPrograms;

public class program29 {
    public static void main(String[] args) {
        String s1 = " Writing    code in java";
        String[] p = s1.split("\s+");
        System.out.println(p.length);
        for (String k:p){
            System.out.println(k);
        }
    }
}
