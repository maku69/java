import java.util.Scanner;

public class iseseisev_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sisestage kolmnurga suurus (täisarv): ");
        int suurus = scanner.nextInt();
        
        for (int i = 1; i <= suurus; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
