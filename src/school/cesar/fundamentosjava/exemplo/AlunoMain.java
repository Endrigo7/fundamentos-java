package school.cesar.fundamentosjava.exemplo;

public class AlunoMain {

    public static void main(String[] args) {
        Aluno jose = new Aluno();
        Aluno joao = new Aluno();

        System.out.println("jose: " + jose.hashCode());
        System.out.println("joao: " + joao.hashCode());

        jose.nome = "jose";
        joao.nome = "joao";

        System.out.println("jose: " + jose);  //jose
        System.out.println("joao: " + joao);  //joao

        jose = joao;
        jose.nome = "Jair";

        System.out.println("after attribution");
        System.out.println("jose: " + jose);  //jair
        System.out.println("joao: " + joao);  //jair

        Aluno maria = new Aluno();
        maria.nome = "maria";

        System.out.println("after maria");
        joao = maria;
        System.out.println("jose: " + jose);  //Jair
        System.out.println("joao: " + joao);  //Maria
        System.out.println("maria: " + maria);  //Maria

        System.out.println("after");
        maria = jose;
        System.out.println("jose: " + jose);  //Jair
        System.out.println("joao: " + joao);  //Maria
        System.out.println("maria: " + maria);  //Jair


    }

}
