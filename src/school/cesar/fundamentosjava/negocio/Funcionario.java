package school.cesar.fundamentosjava.negocio;


class Funcionario {
    String nome;
    int cpf;

    double salario;
    static final double PERCENTUAL_MAXIMO_AUMENTO_SALARIO = 0.25;

    double valorDissidio = 0.10;


    @Override
    public String toString() {
        

        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", salario=" + salario +
                ", valorDissidio=" + valorDissidio +
                '}';
    }
}
