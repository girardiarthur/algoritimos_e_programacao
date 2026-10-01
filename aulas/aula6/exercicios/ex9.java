package aula6.exercicios;
import java.util.Scanner;
public class ex9 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        //VARIAVEIS
        int finalizar,quantidade,produto;
        double valor,acumulador, totalpreco;
        finalizar = 0;
        acumulador = 0;
        valor = 0;

        //TABELA DE PREÇOS
        System.out.println("=== TABELA DE PREÇOS ===");
        System.out.println("100 - CACHORRO QUENTE: R$1,20");
        System.out.println("101 - BAURU SIMPLES: R$1,30");
        System.out.println("102 - BAURU COM OVO: R$1,50");
        System.out.println("103 - HAMBÚRGUER: R$1,20");
        System.out.println("104 - CHEESEBURGUER: R$1,30");
        System.out.println("105 - REFRIGERANTE: R$1,00");

        //pedidos
        while(finalizar == 0) {
            do {
                System.out.println("\nSELECIONE O PRODUTO DESEJADO:");
                produto = entrada.nextInt();
                switch (produto){
                    case 100:
                    valor = 1.20;

                        break;

                    case 101:
                        valor = 1.30;
                        break;

                    case 102:
                        valor = 1.50;
                        break;

                    case 103:
                        valor = 1.20;
                        break;

                    case 104:
                        valor = 1.30;
                        break;

                    case 105:
                        valor = 1.00;
                        break;

                    default:
                        System.out.println("OPÇÃO INVÁLIDA!");
                }
            } while (produto <100 || produto >105);

            //QUANTIDADE
            System.out.println("DIGITE A QUANTIDADE DO PRODUTO:");
            quantidade = entrada.nextInt();

            //VALOR PRODUTO
            totalpreco = valor * quantidade;

            System.out.println("O VALOR TOTAL DO PEDIDO" + produto + ": R$ " + totalpreco);

            //valor total
            acumulador = acumulador + totalpreco;

            //confirmar
            System.out.println("\nVOCÊ DESEJA CONTINUAR COMPRANDO?");
            System.out.println("0 - SIM");
            System.out.println("1 - NÃO");
            finalizar = entrada.nextInt();
        }

        System.out.println("\n\n O VALOR TOTAL DA COMPRA É : R$ " + acumulador);


    }
}
