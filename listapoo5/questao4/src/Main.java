public class Main {
    public static void main(String[] args) {

        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero!");
            }
            return a / b;
        };

        System.out.println("Soma: " + soma.executar(10, 5));
        System.out.println("Subtração: " + subtracao.executar(10, 5));
        System.out.println("Multiplicação: " + multiplicacao.executar(10, 5));
        System.out.println("Divisão: " + divisao.executar(10, 5));
    }
}