import associacao.dio.estudos.joao.Calculadora;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tipo;

        System.out.println("Você deseja fazer um cálculo?");
        String resposta = leitor.nextLine();

        if(Objects.equals(resposta, "Sim")){
            Calculadora calculadora = new Calculadora();
            System.out.println("Qual cálculo deseja fazer?");
            System.out.println("1 - Somar / 2 - Dividir");
            System.out.println("4 - Subtrair / 3 - Multiplicar");
            tipo = leitor.nextInt();

            System.out.println("Digite dois números para serem calculados");
            switch (tipo) {
                case 1 -> calculadora.somar(leitor.nextDouble(), leitor.nextDouble());
                case 2 -> calculadora.dividir(leitor.nextDouble(), leitor.nextDouble());
                case 3 -> calculadora.multiplicacao(leitor.nextDouble(), leitor.nextDouble());
                case 4 -> calculadora.subtrair(leitor.nextDouble(), leitor.nextDouble());
            }


        }
        else{
            System.out.println(" Ok entendemos sua escolha :) ");
        }




    }
}
