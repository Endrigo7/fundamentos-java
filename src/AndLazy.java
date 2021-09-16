public class AndLazy {

    public static void main(String[] args) {
        String exemplo = "";

        if(!exemplo.isEmpty() & exemplo.charAt(10) == 'a'){
            System.out.println("String preenchida");
        }else{
            System.out.println("String vazia");
        }
    }
}
