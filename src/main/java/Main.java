public class Main {
    public static void main(String[] args) {
//        ValidateInteger validateInteger = new ValidateInteger();
//        System.out.println(validateInteger.isNumeric("77355967 "));

        GenerateOrderId generateOrderId = new GenerateOrderId();
        String name1 = "DAGA";
        String name2 = "daga6765";
        generateOrderId.printOrderId(name1, name2);
    }
}
