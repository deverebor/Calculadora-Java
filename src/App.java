import java.util.Scanner;

/*
    Programa feito com o intuito de praticar os conhecimentos em Java.

    @version 0.1
    @author Lucas Souza

*/

public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calc = new Calculadora();

        int op = 6;
        String dev = "Lucas Souza";

        Scanner escolha = new Scanner(System.in);

        System.out.println("\n*************-- Bem Vindo! Vamos Calcular ? --*************\n");
        System.out.println("1 - Soma -");
        System.out.println("2 - Subtração -");
        System.out.println("3 - Multiplicação -");
        System.out.println("4 - Divisão -");
        System.out.println("5 - Sobre a aplicação -");
        System.out.println("0 - Sair -");
        System.out.print("Escolha uma operação, Digite 0 para sair: ");

        op = escolha.nextInt();

        while (op != 0) {

            if (op == 1) {
                // Operação de Soma.
                try {
                    Scanner val1 = new Scanner(System.in);

                    System.out.println("\n**************************");
                    System.out.println("Você selecionou - Soma\n");
                    System.out.print("Insira o primeiro valor a ser somado: ");
                    int a = val1.nextInt();
                    System.out.print("Insira o segundo valor a ser somado: ");
                    int b = val1.nextInt();

                    int resultado = calc.Som(a, b);

                    System.out.println("O resultado da sua soma é: " + resultado);
                } catch (RuntimeException e) {
                    System.out.println("Valor inserido invalido.");
                    System.out.print("Execute a aplicação novamente inserindo um valor válido.");
                }
                break;

            } else if (op == 2) {
                // Operação de Subtração.
                try {
                    Scanner val1 = new Scanner(System.in);

                    System.out.println("\n**************************");
                    System.out.println("Você selecionou - Subtração\n");
                    System.out.print("\nInsira o primeiro valor a ser subtraído: ");
                    int a = val1.nextInt();
                    System.out.print("Insira o segundo valor a ser subtraído: ");
                    int b = val1.nextInt();

                    int resultado = calc.Sub(a, b);

                    System.out.println("O resultado da sua subtração é: " + resultado);
                } catch (RuntimeException e) {
                    System.out.println("Valor inserido invalido.");
                    System.out.println("Execute a aplicação novamente inserindo um valor válido.");
                }
                break;

            } else if (op == 3) {
                // Operação de multiplicação.
                try {
                    Scanner val1 = new Scanner(System.in);

                    System.out.println("\n**************************");
                    System.out.println("Você selecionou - Multiplicação\n");
                    System.out.print("Insira o primeiro valor a ser multiplicado: ");
                    int a = val1.nextInt();
                    System.out.print("Insira o segundo valor a ser multiplicado: ");
                    int b = val1.nextInt();

                    int resultado = calc.Mul(a, b);

                    System.out.println("O resultado da sua multiplicação é: " + resultado);
                } catch (RuntimeException e) {
                    System.out.println("Valor inserido invalido.");
                    System.out.println("Execute a aplicação novamente inserindo um valor válido.");
                }
                break;

            } else if (op == 4) {
                // Operação de divisão.
                try {
                    Scanner val1 = new Scanner(System.in);

                    System.out.println("\n**************************");
                    System.out.println("Você selecionou - Divisão\n");
                    System.out.print("Insira o primeiro valor a ser dividido: ");
                    int a = val1.nextInt();
                    System.out.print("Insira o segundo valor a ser dividido: ");
                    int b = val1.nextInt();

                    int resultado = calc.Div(a, b);

                    System.out.println("Seu resultado é: " + resultado);
                } catch (RuntimeException e) {
                    System.out.println("Valor inserido invalido.");
                    System.out.println("Execute a aplicação novamente inserindo um valor válido.");
                }
                break;

            } else if (op == 5) {
                System.out.println("Desenvolvido por: " + dev + " © 2021 deverebor,Todos os direitos reservados.");
                System.out.println("Saiba mais - https://github.com/deverebor/");
            }
            break;

        }

    }
}
