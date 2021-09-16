import java.util.Scanner;

public class CalculadoraMegaPower {

    public static void main(String[] args) {
        final int OPCAO_SAIR = 1;
        final int OPCAO_SOMAR = 2;

        Scanner leTeclado = new Scanner(System.in);

        int a = 0, b  = 0, opcaoMenu  = 0;

        do {
            System.out.println("Por favor, escolha uma opcao");
            System.out.println("(1) - Sair");
            System.out.println("(" + OPCAO_SOMAR + ") - Somar");
            System.out.println("(3) - Subtrair");
            System.out.println("(4) - Multiplicar");
            System.out.println("(5) - Dividir");

            opcaoMenu = leTeclado.nextInt();

            if(opcaoMenu == OPCAO_SAIR){
                break;
            }else if(opcaoMenu >= OPCAO_SOMAR && opcaoMenu <= 5){
                System.out.println("Digite 2 numeros");
                a = leTeclado.nextInt();
                b = leTeclado.nextInt();
            }

            switch (opcaoMenu) {
                case OPCAO_SOMAR:
                    System.out.println("o resultado da soma é: " + (a + b));
                    break;
                case 3:
                    System.out.println("o resultado da subtracao é: " + (a - b));
                    break;
                case 4:
                    System.out.println("o resultado da mutiplicação é: " + (a * b));
                    break;
                case 5:
                    System.out.println("o resultado da divisão é: " + (a / b));
                    break;
                default:
                    System.out.println("Opção invalida, por favor tente novamente!");
            }
        } while (true);

        leTeclado.close();
    }
}
