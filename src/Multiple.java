import java.util.Scanner;

public class Multiple {

    public static void main(String[] argh) {

        int sum = 0;

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 1; j <= n; j++) {
                int x = 0, resultat = 0;
                for (int k = 0; k < j; k++) {
                    x = a + b * ((int) Math.pow(2, k));
                    resultat += x;
                }
                System.out.print(resultat + " ");
            }


//        int a = 0;
//        int b = 2;
//        int n = 10;


            in.close();
        }
    }
}
