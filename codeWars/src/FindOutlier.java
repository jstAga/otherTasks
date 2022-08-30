public class FindOutlier {
    static int find(int[] integers) {
        int odd = 0;
        int oddCounter = 0;
        int even = 0;
        int evenCounter = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                odd = integers[i];
            } else {
                oddCounter++;
            }
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even = integers[i];
            } else {
                evenCounter++;
            }
        }
        if (evenCounter > oddCounter) {
            return even;
        } else {
            return odd;
        }
    }
}