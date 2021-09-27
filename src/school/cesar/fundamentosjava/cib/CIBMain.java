package school.cesar.fundamentosjava.cib;

import java.util.Scanner;

public class CIBMain {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        Cliente[] clientes = new Cliente[2];
        int quantidadeDeContas = 0;

        while (quantidadeDeContas < 2) {
            Conta conta = new Conta();
            System.out.println("conta criada com sucesso");
            System.out.println(conta);
            
            System.out.println("Digite os dados do cliente");

            System.out.println("Digite o nome");
            String nome = leTeclado.next();

            System.out.println("Digite o cpf");
            String cpf = leTeclado.next();

            while (!CPFUtil.isCPFValido(cpf)) {
                System.out.println("DIgite novmante o cpf");
                cpf = leTeclado.next();
            }

            System.out.println("Digite o valor do deposito inicial");
            conta.creditar(leTeclado.nextDouble());

            Cliente cliente = new Cliente(cpf, nome, conta);
            cliente.setConta(conta);

            clientes[quantidadeDeContas] = cliente;
            quantidadeDeContas++;
        }


        leTeclado.close();
    }

}
