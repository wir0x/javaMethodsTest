public class Main {
    public static void main(String[] args) {
//        ValidateInteger validateInteger = new ValidateInteger();
//        System.out.println(validateInteger.isNumeric("77355967 "));

        GenerateOrderId generateOrderId = new GenerateOrderId();
        String name1 = "1234567891234567891234567894564654654";
        String name2 = "656";
        String name3 = "45";
        String name4 = "123";

//        System.out.println(GenerateOrderId.orderIdToWeb(name1, name2, name3, name4));
//        System.out.println(generateOrderId.orderIdToWeb(name1, name2, name3, name4).length());
        System.out.println(GenerateOrderId.setZero(name1, 20));
        System.out.println(GenerateOrderId.setZero(name1, 20).length());
        System.out.println(GenerateOrderId.getDefaultKey(name1, 10));
//        generateOrderId.printOrderId(name1, name2);
    }
}
