package allPrograms;

public class program34 {
    public static void main(String[] args) {
        String str = "23a34P3qR30T5";
        String[] p = str.split("[a-zA-Z]+");
        System.out.println(p.length);
        int sum=0;
        for (String k:p)
            sum+=Integer.parseInt(k);
        System.out.println("Total sum is: " + sum);

    }
}

