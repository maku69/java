public class Iseseisev_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 66; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                if (i < 66) {
                    System.out.print(", ");
                }
            }
        }
    }
}
