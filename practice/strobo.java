
import java.util.Scanner;

class strobo {

    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        String s = sw.next();
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '0' || c == '1' || c == '8') {
                s1.append(c);
            } else if (c == '6') {
                s1.append('9');
            } else if (c == '9') {
                s1.append('6');
            } else {
                System.out.print("Not a Strobogramatic");
                return;
            }
        }
        if (s1.toString().equals(s)) {
            System.out.print("Strobogramatic");
        } else {
            System.out.print("Not a Strobogramatic");
        }
    }
}
