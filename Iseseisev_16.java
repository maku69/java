public class Iseseisev_16 {
    public static void main(String[] args) {
        int[] arvud = {5, 23, 5, 1, 1238}; // Pane arvud siia

        int summa = 0;
        for (int arv : arvud) {
            summa += arv;
        }

        double keskmine = (double) summa / arvud.length;

        System.out.println("Summa: " + summa);
        System.out.println("Keskmine: " + keskmine);
    }
}
