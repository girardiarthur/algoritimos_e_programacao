package aula6;
import java.util.Scanner;
public class ex6 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int num, cont,menor;
        System.out.println("DIGITE UM NÚMERO INTEIRO E POSITIVO:");
        num = entrada.nextInt();
        menor = num;

        cont = 1;
        do {
            System.out.println("DIGITE UM NÚMERO INTEIRO E POSITIVO:");
            num = entrada.nextInt();

            if (num <= menor) {
                menor = num;
            }
            cont++;
        }
        while(cont <= 9);

        System.out.println("O MENOR NÚMERO É: " + menor);
    }
}
