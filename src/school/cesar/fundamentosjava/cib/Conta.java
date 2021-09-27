package school.cesar.fundamentosjava.cib;

import java.util.Random;

public class Conta {

    private String numero;
    private double saldo;

    public Conta() {
        numero = gerarNumero();
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String num) {
        numero = num;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    private String gerarNumero() {
        return new Random().nextInt() + "-" + new Random().nextInt();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

