package allPrograms;

public class program33 {
    public static void main(String[] args) {
        String str1 = "javais#13funan12!@deasyto@learn";
        String[] p1 = str1.split("[0-9]");

        for (String k:p1)
            System.out.println(k);
    }
}
