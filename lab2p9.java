public class lab2p9 {
    public static void main(String[] args) {
        for (int row = 0; row < 9; row++) {
            int spaces = row < 5 ? row : 8 - row;
            int stars = 5 - spaces;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < stars; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}