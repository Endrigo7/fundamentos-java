package school.cesar.fundamentosjava.cib;

import java.util.Random;
import java.util.Scanner;

public class CIBMain {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        Conta[] contas = new Conta[2];
        int quantidadeDeContas = 0;

        while (quantidadeDeContas < 2) {
            Conta conta = new Conta();
            conta.numero = new Random().nextInt() + "-" + new Random().nextInt();
            conta.saldo = new Random().nextDouble();

            System.out.println("Digite os dados do cliente");
            conta.cliente = new Cliente();

            System.out.println("Digite o nome");
            conta.cliente.nome = leTeclado.next();

            System.out.println("Digite o cpf");
            conta.cliente.cpf = leTeclado.next();

            contas[quantidadeDeContas] = conta;
            quantidadeDeContas++;
        }

        if (contas[0].saldo > contas[1].saldo) {
            System.out.println("O cliente de maior saldo é: " + contas[0].cliente.nome +
                    "com saldo :" + contas[0].saldo + " enquanto o outro saldo é " + contas[1].saldo);
        } else if (contas[0].saldo < contas[1].saldo) {
            System.out.println("O cliente de maior saldo é: " + contas[1].cliente.nome +
                    "com saldo :" + contas[1].saldo + " enquanto o outro saldo é " + contas[0].saldo);
        } else {
            System.out.println("Clientes tem o mesmo saldo");
        }

        leTeclado.close();
    }

}
