package school.cesar.fundamentosjava.negocio;

class CalculoSalario {

    public static void main(String[] args) {
        Funcionario jair = new Funcionario();
        Funcionario joao = new Funcionario();

        jair.nome = "jair";
        joao.nome = "joao";

        System.out.println(jair);
        System.out.println(joao);

        jair.nome = "Jair Jose";
        jair.valorDissidio = 0.15;

        System.out.println(jair);
        System.out.println(joao);

    }


}
