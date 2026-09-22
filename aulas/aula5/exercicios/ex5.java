package aula5.exercicios;
import java.util.Scanner;
public class ex5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("==== ESCOLHA UMA DAS OPÇÕES ====");
        System.out.println("M - CALCULAR A MÉDIA\nS - DIFERENÇA DO MAIOR PELO MENOR\nP - PRODUTO \nD - DIVISAO DO PRIMEIRO PELO SEGUNDO");
        char opcao = entrada.next().charAt(0);
        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double num1 = entrada.nextDouble();
        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double num2 = entrada.nextDouble();
        switch (opcao){

            case 'M':
            case 'm':
                double media = (num1 + num2) / 2;
                System.out.println("A MÉDIA ENTRE OS NÚMEROS DIGITADOS É DE: " + media);
                break;

            case 'S':
            case 's':
                double diferenca;

                if(num1 > num2){
                    diferenca = num1 - num2;
                }
                else {
                    diferenca = num2 - num1;
                }
                System.out.println("A DIFERENÇA DO MAIOR NÚMERO PELO MENOR É : " + diferenca);
                break;

            case 'P':
            case 'p':
                double produto = num1 * num2;
                System.out.println("O PRODUTO ENTRE OS NÚMEROS DIGITADOS É IGUAL A: " + produto);
                break;

            case 'D':
            case 'd':
                if (num2 == 0){
                    System.out.println("IMPOSSIVEL DIVIDIR!");
                }
                else {
                    double divisao = num1 / num2;
                    System.out.println("A DIVISÃO ENTRE O PRIMEIRO E O SEGUNDO NUMERO É IGUAL A: " + divisao);
                }
                break;

            default:
                System.out.println("OPÇÃO INVALIDA! TENTE NOVAMENTE!");
        }
    }
}
