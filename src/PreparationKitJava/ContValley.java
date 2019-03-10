package PreparationKitJava;

public class ContValley {
    public static void main(String[] args) {
        int counter = 0;
        int steps = 8;
        String s = "UDDDUDUU";

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            int level = 0;

            if (ch == 'U'){
                ++level;

            }
            if (ch == 'D'){
                --level;
                if (level == 0) {
                    ++counter;
                }
            }

        }
        System.out.println(counter);
    }
}
