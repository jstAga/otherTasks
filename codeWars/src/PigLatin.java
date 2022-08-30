public class PigLatin {
    public static String pigIt(String str) {
        String[] splitedStr = str.split(" ");
        String answer = "";
        for (int i = 0; i < splitedStr.length; i++) {
            if (splitedStr[i].equals("!") || splitedStr[i].equals("?") || splitedStr[i].equals(",") || splitedStr[i].equals(".")) {
                answer += splitedStr[i];
            } else {
                answer += splitedStr[i].substring(1) + splitedStr[i].charAt(0) + "ay ";
            }
        }
        return answer;
    }
}
