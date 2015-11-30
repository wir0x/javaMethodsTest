public class PrefixTigo {

    public boolean prefixTigo(String tigoLine) throws Exception {
        String prefixTigo = "75;76;77;78;69";
        String tigoLinePrefix = tigoLine.substring(0, 2);
        boolean flag = false;
        for (String prefix : prefixTigo.split(";"))
            if (tigoLinePrefix.contains(prefix))
                flag = true;
        if (!flag)
            throw new Exception(String.format("%s No es un numero TIGO ", tigoLine));
        else
            System.out.println("number tigo Ok");
        return flag;
    }
}

