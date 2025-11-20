
public class binPal {

    public static void main(String[] args) {
        int n = 0;
        String s1 = "";
        String s2 = "";
        while (n > 0) {
            s1 = s1 + (n % 2);
            s2 = (n % 2) + s2;
            n /= 2;
        }
        if (s1.equals(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
