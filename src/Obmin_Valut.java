import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.ENGLISH;
import static java.util.Locale.US;

public class Obmin_Valut {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            //get format instances
            NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat franceF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat chinaF = NumberFormat.getCurrencyInstance(Locale.CHINA);

            //create Locale for India
            Locale IND = new Locale("English","India");

            NumberFormat indiaF = NumberFormat.getCurrencyInstance(IND.ENGLISH);

            //String us = usF.format(payment);
            String india = indiaF.format(payment);
            String china = chinaF.format(payment);
            String france = franceF.format(payment);

            //System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);


        }
}
