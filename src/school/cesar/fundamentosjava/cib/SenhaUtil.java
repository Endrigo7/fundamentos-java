package school.cesar.fundamentosjava.cib;

public class SenhaUtil {

    public static boolean isSenhaValida(String senha) {
        
        if (senha.length() == 6) {
            return true;
        }

        return false;
    }
}
