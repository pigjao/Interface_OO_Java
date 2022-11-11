package associacao.dio.estudos.joao;



public class Calculadora implements OperacaoMatematica{


    @Override
    public void dividir(double num1, double num2) {

        double resultado = num1 / num2;
        System.out.println("O resultado é: " + resultado);
    }

    @Override
    public void multiplicacao(double num1, double num2) {

        double resultado = num1 * num2;
        System.out.println("O resultado é: " + resultado);
    }

    @Override
    public void somar(double num1, double num2) {

        double resultado = num1 + num2;
        System.out.println("O resultado é: " + resultado);    }

    @Override
    public void subtrair(double num1, double num2) {

        double resultado = num1 - num2;
        System.out.println("O resultado é: " + resultado);
    }
}
