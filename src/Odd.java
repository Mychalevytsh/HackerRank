import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        isOdd(n);

    }
    static void isOdd(int n){
        if (n%2 == 1){
            System.out.println("Weird");

                }else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            }
            if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }
            if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
