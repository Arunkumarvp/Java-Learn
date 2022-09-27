package pattern;

public class patter1 {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= ((2 * num) - 1); j++) {
                if (j >= (num - (i - 1)) && j <= (num + (i - 1))) {
                    System.out.print("*");

                } else {
                    System.out.println();
                }

            }

        }
    }
}
