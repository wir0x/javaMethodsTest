/**
 * Created by gonzalo on 10/11/2015.
 */
public class PrefixTigo {
    public static void main(String[] args) throws Exception {
        String lineTIGO = "7735596724";
        Integer line = 77355967;
        String tigoLine = line.toString();
        String tigoLinePrefix = tigoLine.substring(0, 2);
        String prefixTigo = "75;76;77;78;69";

//        for (String prefix : prefixTigo.split(";")) {
//            System.out.println("prefix --> "+ prefix);
//            if (tigoLine.substring(0, 2).equals(prefix)) {
//                System.out.println("yes!!" + prefix);
//            }
//        }

        boolean flag = false;
        for (String prefix : prefixTigo.split(";"))
            if (tigoLinePrefix.contains(prefix))
                flag = true;
        if (!flag)
            throw new Exception(String.format("%s No es un numero TIGO ", tigoLine));
        else
            System.out.println("number tigo Ok");
    }
}
