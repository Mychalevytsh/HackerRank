package Code30Days.Day13InHeritance;

import java.util.Scanner;

public class InH {

        public static void main(String[] args) {
            int [] testScores = {80,65};
            int [] testScores1 = {73,65};
            int [] testScores2 = {55,95,35};


            Student s = new Student("Ivan", "Hava", 123456, testScores);
            Student b = new Student("Ivan", "Hava", 123456, testScores1);
            Student c = new Student("Ivan", "Hava", 123456, testScores2);

            System.out.println("Grade: " + s.calculate());
            System.out.println("Grade: " + b.calculate());
            System.out.println("Grade: " + c.calculate());
        }

}
