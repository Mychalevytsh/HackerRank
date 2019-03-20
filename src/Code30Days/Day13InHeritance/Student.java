package Code30Days.Day13InHeritance;

class Student {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int [] scores)
    {

    }


    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    char calculate (){
        int a = 0,sum = 0;
        char result = '0';
        for(int i = 0; i < testScores.length; i++){
            sum += testScores[i];
        }
        a = sum/testScores.length;

             if    (a <=100 && a >= 90)  { result = 'O';}
        else if    (a < 90 && a >= 80)   { result = 'E';}
        else if    (a < 80 && a >= 70)   { result = 'A';}
        else if    (a < 70 && a >= 55)   { result = 'P';}
        else if    (a < 55 && a >= 40)   { result = 'D';}
        else if    (a < 40)              { result = 'T';}

        return result;
    }
}
