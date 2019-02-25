

public class Main {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int result = 0,level = 0;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(n);
            if (c == 'U') {
                level +=1;
            }else if (level == 0){
                result +=1;
                level -=1;
            }

        }
return 0;
    }

    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int k = 8;
        countingValleys(k,s);
    }
}
