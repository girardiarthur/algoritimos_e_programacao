package aula4;
import java.util.Scanner;
//ARTHUR GIRARDI
public class ex6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String NEGRITO = "\u001B[1m";
        String RESET = "\u001B[0m";

        System.out.println(NEGRITO + "[[[[CALCULADORA DE PESO IDEAL]]]]"+ RESET);
        System.out.println("DIGITE SUA ALTURA EM METROS");
        double altura = entrada.nextDouble();
        System.out.println("DIGITE M SE SEU SEXO É MASCULINO E F PARA FEMININO");
        char sexo = entrada.next().charAt(0);
        if(sexo == 'M' || sexo == 'm'){
            double pesoIdeal =  (72.7 * altura) - 58;
            System.out.printf("SEU PESO IDEAL É DE: %.2f KG", pesoIdeal);
        }
        else if (sexo == 'F' || sexo == 'f'){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("SEU PESO IDEAL É DE: %.2f KG", pesoIdeal);
        }
        else{
            System.out.println(NEGRITO+ "ERRO! DIGITE O SEXO DENOVO" + RESET);
        }
        entrada.close();
    }
}
