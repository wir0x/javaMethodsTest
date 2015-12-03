import java.util.Random;

public class GenerateOrderId {
    public String printOrderId(String name1, String name2) {
        String key1 = getNameKey(name1, 8);
        String key2 = getNameKey(name2, 8);
        String key3 = getRandomId();
        String orderId = key1 + key2 + key3;
        return orderId;
    }


    public String getNameKey(String name, int length) {
        String key = "";
        String _name = removeSpace(name);

        int lengthName = getLengthStr(name, length);
        for (int i = 0; i < lengthName; ++i)
            key += _name.substring(i, i + 1);

        return key;
    }

    public static String orderIdToWeb(String id1, String id2, String id3, String id4) {
        String key1 = setZero(id1, 6);
        String key2 = setZero(id2, 6);
        String key3 = setZero(id3, 2);
        String key4 = setZero(id3, 6);
        String orderId = key1 + key2 + key3 + key4;
        return orderId.length() > 20 ? getDefaultKey(orderId, 20) : orderId;
    }

    public static String getDefaultKey(String name, int length) {
        String key = "";
        String _name = removeSpace(name);

        int lengthName = getLengthStr(name, length);
        for (int i = 0; i < lengthName; ++i)
            key += _name.substring(i, i + 1);
        return key;
    }

    private static int getLengthStr(String str, int length) {
        return str.length() < length ? str.length() : length;
    }

    private static String getRandomId() {
        int _iKey = new Random().nextInt(9999);
        return String.valueOf(_iKey);
    }

    public static String setZero(String number, int length) {
        String key = "";
        String _number = removeSpace(number);
        int _length = getLength(_number, length);
        if (_number.length() > length) return getDefaultKey(_number, length);
        for (int i = _length; i < length; ++i) key += "0";
        key += _number;
        return key;
    }

    private static String removeSpace(String str) {
        return str.replaceAll("\\s+", "");
    }

    private static int getLength(String str, int length) {
        return str.length() > length ? length : str.length();
    }

}
