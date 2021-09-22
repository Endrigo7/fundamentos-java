package school.cesar.fundamentosjava.q1;

import java.util.Scanner;

public class Q1Main {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);


        int opcaoMenu = -99;
        Aluno[] alunos = new Aluno[Constantes.QUANTIDADE_MAXIMA_DE_ALUNOS];
        int quantidadeAlunosCadastrados = 0;

        do {
            System.out.println("Escolha uma opcao");
            System.out.println("(" + Constantes.OPCAO_MENU_CADASTRAR_ALUNO + ") - Cadastrar um aluno");
            System.out.println("(" + Constantes.OPCAO_MENU_MEDIA_ALUNO + ") - Exibir média do aluno");
            System.out.println("(" + Constantes.OPCAO_MENU_MAIOR_MEDIA + ") - Exibir qual aluno tem maior media");
            System.out.println("(" + Constantes.OPCAO_MENU_SAIR + ") - Sair");

            opcaoMenu = leTeclado.nextInt();

            switch (opcaoMenu) {
                case Constantes.OPCAO_MENU_CADASTRAR_ALUNO:
                    if (quantidadeAlunosCadastrados >= alunos.length) {
                        System.out.println("quantidade maxima de alunos já cadastrados");
                    } else {
                        alunos[quantidadeAlunosCadastrados] = criarAluno(leTeclado);
                        quantidadeAlunosCadastrados++;
                        System.out.println("Voce cadastrou " + quantidadeAlunosCadastrados
                                + " de um total de " + Constantes.QUANTIDADE_MAXIMA_DE_ALUNOS);
                    }

                    break;
                case Constantes.OPCAO_MENU_MEDIA_ALUNO:
                    System.out.println("Digite a matricula");
                    long matriculaAluno = leTeclado.nextLong();

                    Aluno alunoEncontrado = encontrarAluno(matriculaAluno, alunos);
                    if (alunoEncontrado == null) {
                        System.out.println("Matricula + " + matriculaAluno + " inexistente! ");
                    } else {
                        System.out.println("A media do aluno " + alunoEncontrado.nome
                                + " é: " + alunoEncontrado.calcularMedia());
                    }
                    break;
                case Constantes.OPCAO_MENU_MAIOR_MEDIA:
                case Constantes.OPCAO_MENU_SAIR:
                    break;
            }

        } while (opcaoMenu != Constantes.OPCAO_MENU_SAIR);
    }

    private static Aluno criarAluno(Scanner leTeclado) {
        Aluno aluno = new Aluno();

        System.out.println("Por favor, digite a matricula");
        aluno.matricula = leTeclado.nextLong();

        System.out.println("Por favor, digite o nome");
        aluno.nome = leTeclado.next();

        System.out.println("Por favor, digite a nota1");
        aluno.nota1 = leTeclado.nextDouble();

        System.out.println("Por favor, digite a nota2");
        aluno.nota2 = leTeclado.nextDouble();

        return aluno;
    }


    public static void teste(Scanner leTeclado) {
        System.out.println("digite um numero");
        int numero = leTeclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("numero par");
        }

        System.out.println("numero impar");
    }


    private static Aluno encontrarAluno(long matricula, Aluno[] listaAlunos) {
        for (int i = 0; i < listaAlunos.length; i++) {
            if (listaAlunos[i].matricula == matricula) {
                return listaAlunos[i];
            }

            /*
             * Mesmo que isso aqui
             * Aluno aluno = alunos[i];
             * if (aluno.matricula == matricula) {
             *   return aluno;
             * }
             */
        }

        return null;
    }
}
//10 min
/*
 * Crie uma classe Conta (Numero e Saldo)
 * Crie uma classe Cliente (CPF e Nome)
 * Uma Conta deve ter um Cliente
 * Cria uma classe com um metodo main.
 * Nesta classe, criei duas contas e informe o nome do cliente de maior saldo.
 * o saldo deve receber o resultado de um numero aleatorio -> new Random().nextDouble();
 */
