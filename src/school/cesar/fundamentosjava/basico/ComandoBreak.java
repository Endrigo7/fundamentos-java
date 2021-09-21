package school.cesar.fundamentosjava.basico;

public class ComandoBreak {

    public static void main(String[] args) {
        int a = 31;
        switch (a) {
            case 1:
                System.out.println("a");
                break;
            case 2:
            case 3:
                System.out.println("c");
                break;
            default:
                System.out.println("d");
                break;
        }

        if (a == 1) {
            System.out.println("a");
        } else if ((a == 2) || (a == 3)) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }
    }
}