public class lab2p10 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int temp;

        if (b < a) {
            temp = a;
            a = b;
            b = temp;
        }

        if (d < c) {
            temp = c;
            c = d;
            d = temp;
        }

        if (c < a) {
            temp = b;
            b = d;
            d = temp;
            c = a;
        }

        a = e;

        if (b < a) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = b;
            b = d;
            d = temp;
            a = c;
        }

        System.out.println(Math.min(a, d));
    }
}