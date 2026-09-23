package aula5.exercicios;
import java.util.Scanner;
public class ex6 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int codigo,quantidade;
        double valor;
        quantidade =0;
        System.out.println("==ESCOLHA UM PRODUTO==");
        System.out.println("100 - Cachorro quente - R$1,20");
        System.out.println("101 - Bauru simples - R$1,30");
        System.out.println("102 - Bauru com ovo - R$1,50");
        System.out.println("103 - Hambúrguer - R$1,20");
        System.out.println("104 - Cheeseburguer - R$1,30");
        System.out.println("105 - Refrigerante - R$1,00");
        codigo = entrada.nextInt();
        System.out.println("DIGITE A QUANTIDADE");
        quantidade = entrada.nextInt();

        switch (codigo){
            case 100:
                valor = 1.20;
                valor = valor * quantidade;
                System.out.println("VOCÊ ESCOLHEU O CACHORRO QUENTE");
                System.out.printf("O VALOR A SER PAGO É: R$ %.2f ", valor);
                break;
            case 101:
                valor = 1.30;
                valor = valor * quantidade;
                System.out.println("VOCÊ ESCOLHEU O BAURU SIMPLES");
                System.out.printf("O VALOR A SER PAGO É: R$ %.2f ", valor);
                break;

            case 102:
                valor = 1.50;
                valor = valor * quantidade;
                System.out.println("VOCÊ ESCOLHEU O BAURU COM OVO");
                System.out.printf("O VALOR A SER PAGO É: R$ %.2f ", valor);
                break;

            case 103:
                valor = 1.20;
                valor = valor * quantidade;
                System.out.println("VOCÊ ESCOLHEU O HAMBÚRGUER");
                System.out.printf("O VALOR A SER PAGO É: R$ %.2f ", valor);
                break;

            case 104:
                valor = 1.30;
                valor = valor * quantidade;
                System.out.println("VOCÊ ESCOLHEU O CHEESEBÚRGUER");
                System.out.printf("O VALOR A SER PAGO É: R$ %.2f ", valor);
                break;

            case 105:
                valor = 1.00;
                valor = valor * quantidade;
                System.out.println("VOCÊ ESCOLHEU O REFRIGERANTE");
                System.out.printf("O VALOR A SER PAGO É: R$ %.2f ", valor);
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA!");

        }
    }
}
