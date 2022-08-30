class Solution {

    static String toCamelCase(String str) {
        if (str == ""){
            return "";
        }
        String[] splitedStr = str.split("-|_");
        String answer = "";
        for (int i = 0; i < splitedStr.length; i++) {
            if (answer.equals("") && (splitedStr[0].charAt(0) == splitedStr[0].toLowerCase().charAt(0))){
                answer += splitedStr[0];
                continue;
            } else if
            (splitedStr[i].charAt(0) == splitedStr[i].toLowerCase().charAt(0)) {
                splitedStr[i] = splitedStr[i].substring(0, 0) + splitedStr[i].toUpperCase().charAt(0) +
                        splitedStr[i].substring(1);

                answer += String.join("", splitedStr[i]);
            } else if ((splitedStr[i].charAt(0) == splitedStr[i].toUpperCase().charAt(0))) {
                answer += splitedStr[i];
            }
        }
        return answer;
    }
}