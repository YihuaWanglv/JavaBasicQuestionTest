package sample;

public class StringReverse {

    public static void main(String[] args) {
        String str = "012345";
        System.out.println(reverse(str));
    }

    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

}
