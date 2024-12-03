package allPrograms;

public class program32 {
    public static void main(String[] args) {
        String str = "23a34P3qR30T5";
        String[] p = str.split("[a-zA-Z]+");
        System.out.println(p.length);

        for (String k:p)
            System.out.println(k);

    }
}

