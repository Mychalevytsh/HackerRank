package Code30Days.day14;


public class Difference {
    public int maximumDifference;
    private int [] elements;

    public Difference(int[] ar) {
        elements = ar;
    }

    void computeDifference() {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//find max and min value in array
        for (int i = 0; i < elements.length; i++) {

            if (elements[i] < min) {
                min = elements[i];
            }
            if ((elements[i] > max)) {
                max = elements[i];
            }

        }
        System.out.println("min = " + min + " max = " + max  );
        maximumDifference = max - min;
    }
}

// 1st way
//     for (int i = 0; i < elements.length; i++) {
//           for (int j = i + 1; j < elements.length ; j++) {
//               int abs = Math.abs(elements[i] - elements[j]);
//              if(abs > maximumDifference){
//                  maximumDifference = abs;
//               }
//           }
//       }

//2nd way
// Arrays.sort(elements);
//        maximumDifference =(elements[elements.length-1] - elements[0]);
