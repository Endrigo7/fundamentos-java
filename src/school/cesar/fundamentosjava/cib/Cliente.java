package school.cesar.fundamentosjava.cib;

public class Cliente {
    private String cpf;
    private String nome;
    private Conta conta;

    public Cliente(String c, String n, Conta con) {
        cpf = c;
        nome = n;
        conta = con;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta c) {
        conta = c;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
