import java.util.Scanner;

public class FuncionarioMain {

    public static void main(String[] args) {

        //verde
        Funcionario adelino = new Funcionario();
        adelino.nome =  "adelino";

        //vermelha
        Funcionario lucca = new Funcionario();
        lucca.nome = "lucca";

        //azul
        Funcionario alexandre = new Funcionario();
        alexandre.nome = "alexandre";

        System.out.println(adelino);  //adelino
        System.out.println(lucca);    //Lucca
        System.out.println(alexandre);  //Alexandre

        adelino = lucca;
        lucca.nome = "Tarci";

        lucca = alexandre;
        alexandre.nome = "Miguel";

        System.out.println(adelino);
        System.out.println(lucca);
        System.out.println(alexandre);

        int x = 10;
        int y = 20;
        int z = 30;
        x = y;
        y = z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

}
