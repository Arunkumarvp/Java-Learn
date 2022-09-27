package pattern;

public class pattern2 {
    {
        int num = 6;
        for (int i = 0; i <= num; i++) {
            for (int j = num - i; j > 1; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

}
