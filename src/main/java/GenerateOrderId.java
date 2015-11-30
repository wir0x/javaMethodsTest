import java.util.Random;

public class GenerateOrderId {
    public String printOrderId(String name1, String name2) {
        String key1 = getNameKey(name1, 8);
        String key2 = getNameKey(name2, 8);
        String key3 = getRandomId();
        String orderId = key1 + key2 + key3;
        System.out.println(orderId);
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

    public int getLengthStr(String name, int length) {
        int LENGTH = length;
        return name.length() < LENGTH ? name.length() : LENGTH;
    }

    public String getRandomId() {
        int _iKey = new Random().nextInt(999);
        return String.valueOf(_iKey);
    }

    public String removeSpace(String str) {
        return str.replaceAll("\\s+", "");
    }
}
