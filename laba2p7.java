public class laba2p7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (long power = 1; power <= n; power *= 2) {
            System.out.println(power);
        }
    }
}