import java.util.Random;
import java.util.UUID;

public class ConvertString {
    public static boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) != '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i), radix) < 0) return false;
        }
        return true;
    }

    public static String getUniqueId() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] arg) {

//            byte[] array = new byte[7]; // length is bounded by 7
//            new Random().nextBytes(array);
//            String generatedString = new String(array, Charset.forName("UTF-8"));

            System.out.println(new Random().nextInt(9999));
//        String uniqueId = getUniqueId();
//        System.out.println("uniqueId: " + uniqueId);

    }
}
