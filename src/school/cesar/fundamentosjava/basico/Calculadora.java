package school.cesar.fundamentosjava.basico;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        final int OPCAO_SAIR = 1;
        final int OPCAO_SOMAR = 2;
        final int OPCAO_SUBTRAIR = 3;
        final int OPCAO_MUTIPLICAR = 4;
        final int OPCAO_DIVIDIR = 5;

        Scanner leTeclado = new Scanner(System.in);

        int opcaoMenu = 0;
        int a = 0, b = 0;

        do {
            System.out.println("Por favor, selecione uma opção");
            System.out.println("(" + OPCAO_SAIR + ") - Sair");
            System.out.println("(" + OPCAO_SOMAR + ") - Somar");
            System.out.println("(" + OPCAO_SUBTRAIR + ") - Subtrair");
            System.out.println("(" + OPCAO_MUTIPLICAR + ") - Mutiplicar");
            System.out.println("(" + OPCAO_DIVIDIR + ") - Dividir");

            opcaoMenu = leTeclado.nextInt();

            if (opcaoMenu >= OPCAO_SOMAR && opcaoMenu <= OPCAO_DIVIDIR) {
                System.out.println("Digite 2 numeros inteiros");
                a = leTeclado.nextInt();
                b = leTeclado.nextInt();
            }

            switch (opcaoMenu) {
                case OPCAO_SAIR:
                    System.out.println("Obrigado por usar o nosso programa!");
                    break;
                case OPCAO_SOMAR:
                    System.out.println("o resultado da soma entre " + a + " e " + b + " é: " + (a + b));
                    break;
                case OPCAO_SUBTRAIR:
                    System.out.println("o resultado da subtração entre " + a + " e " + b + " é: " + (a - b));
                    break;
                case OPCAO_MUTIPLICAR:
                    System.out.println("o resultado da mutiplicação entre " + a + " e " + b + " é: " + (a * b));
                    break;
                case OPCAO_DIVIDIR:
                    System.out.println("o resultado da divisão entre " + a + " e " + b + " é: " + (a / b));
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (opcaoMenu != OPCAO_SAIR);
    }
}
//escreva um programa java que leio o seu primeiro nome do teclado - OK
// se o nome estiver preenchido com espacos em branco nao faca nada
// se o nome estiver preenchido imprima : Ola, Sr(a) #NOME#
// USE nextLINE
// USE String.equals() e use String.trim()


// escreva um programa java que leia um numero inteiro do teclado
// se ele for par imprima par
// se ele for impar imprima impar :-)

//escreve uma programa java que leia 2 numeros reais ok
// calcula a media aritimetica e informa ok
// media menor que 4 - reprovado
// entre 4 e menor que 7 final
// maior ou igual a 7 aprovado

// escreva um programa java que leia 3 numeros inteiros e classifque o triangulo em relacao aos lados

//crie um programa java que leia um numero do teclado
// e imprima todos os numeros pares
// entre o numero lido e 1000

//crie um programa java que exiba uma opcao de menu
// 1- somar 2 numeros
// 2 - subtrair 2 numeros
// 3 - sair
// realize a operacao escolhida pelo usuario.

//crei um programa JAVA que imprima todos os pares de 100 ate 200
// use for e nao use if
// seu bloco do for nao deve ter chaves :-)

//crie um programa java que exiba uma opcao de menu
// 1 - sair
// 2- somar 2 numeros
// 3 - subtrair 2 numeros
// 4 - mut 2 numeros
// 5 - div 2 numeros
// realize a operacao escolhida pelo usuario.
// se op diferente de 1 ah 5 informe op inv. dig. nov.
// use switch

