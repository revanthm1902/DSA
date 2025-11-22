
public class swap2nib {

    public static void main(String[] args) {
        int x = 150;
        int swapx = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
        System.out.println(swapx);
    }
}
