package Strings;

public class compareTo {

    public static int compareTo(String a, String b) {

        for (int i = 0; i < a.length() && i < b.length(); i++) {

            if (a.charAt(i) < b.charAt(i)) {
                return -1;
            }
            else if (a.charAt(i) > b.charAt(i)) {
                return 1;
            }
        }

        if (a.length() < b.length()) {
            return -1;
        }
        else if (a.length() > b.length()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String a = "bhavika";
        String b = "bhavika";

        System.out.println(compareTo(a, b));
    }
}
