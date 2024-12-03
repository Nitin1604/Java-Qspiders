package allPrograms;

public class program35 {
    public static void main(String[] args) {
        String str = "23a34P3qR30T5";
        // It will split whenever one or more non numeric character is found
        String[] p = str.split("[^0-9]+");
        System.out.println(p.length);
        int sum=0;
        for (String k:p) {
            System.out.println(k);
            sum += Integer.parseInt(k);
        }

        System.out.println("Total sum is: " + sum);

    }
}
