package school.cesar.fundamentosjava.q1;

public class Aluno {

    long matricula;
    String nome;
    double nota1;
    double nota2;
    
    public double calcularMedia() {
        double numerador = ((nota1 * Constantes.PESO1) + (nota2 * Constantes.PESO2));
        double denominador = (Constantes.PESO1 + Constantes.PESO2);
        return numerador / denominador;
    }
}
