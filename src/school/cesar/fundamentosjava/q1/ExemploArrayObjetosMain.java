package school.cesar.fundamentosjava.q1;

public class ExemploArrayObjetosMain {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];
        alunos[0] = new Aluno();
        alunos[0].nome = "Jair";
        System.out.println(alunos[0].nome);
    }
}
