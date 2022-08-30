public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds < 0) {
            return "Suck my dick";
        }
        String sec = "" + (seconds % 60);
        String minutes = "" + (seconds / 60) % 60;
        System.out.println(minutes);
        String hours = "" + (seconds / 60) / 60;

        if (sec.length() == 1) {
            sec = "0" + (seconds % 60);
        } else if (sec.length() == 0) {
            sec = "00";
        } else {
            sec = (seconds % 60) + "";
        }

        if (minutes.length() == 1) {
            minutes = "0" + (seconds / 60) % 60;
        } else if (minutes.length() == 0) {
            minutes = "00";
        } else {
            minutes = "" + (seconds / 60) % 60;
        }

        if (hours.length() == 1) {
            hours = "0" + (seconds / 60) / 60;
        } else if (hours.length() == 0) {
            hours = "00";
        } else {
            hours = (seconds / 60) / 60 + "";
        }
        return (hours + ":" + minutes + ":" + sec);
    }
}
