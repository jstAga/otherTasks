public class Kata {
    static double findUniq(double[] integers) {
        for (int i = 0; i < integers.length - 1; i++) {
            if (integers[i] != integers[i + 1]) {
                return integers[i + 1];
            }
        }
        return 0;
    }


    public static String incrementString(String str) {
        char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'},
                alphabet = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',
                        'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char[] strArr = str.toCharArray();
        String fullInt = "", answer = "";
        int newInt = 0;

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (strArr[i] == nums[j]) {
                    fullInt += String.valueOf(strArr[i]);
                }
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (strArr[i] == alphabet[j]) {
                    answer += String.valueOf(strArr[i]);
                }
            }

        }
        newInt = Integer.parseInt(fullInt);
        if (newInt == 0) {
            for (int i = 0; i < fullInt.length(); i++) {
                answer += "0";
            }
        } else if (fullInt.length() == 0) {
            answer += "1";
        }
        return answer + "" + (newInt + 1);
    }
}
