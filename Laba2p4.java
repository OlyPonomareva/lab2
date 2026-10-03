public class Laba2p4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double value = Math.random();
            System.out.println(value);
            sum += value;
        }

        if (n > 0) {
            System.out.println("Среднее значение: " + sum / n);
        }
    }
}
