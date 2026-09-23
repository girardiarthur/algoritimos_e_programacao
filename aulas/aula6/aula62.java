package aula6;
import java.util.Scanner;
public class aula62 {
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);
        int contador, acumuladorpar, acumuladorimpar, num;
        contador = 0;
        acumuladorimpar = 0;
        acumuladorpar = 0;

        while (contador < 10) {
            contador++;
            System.out.println("digite um número " + contador);
            num = entrada.nextInt();
            if (num % 2 == 0) {
                acumuladorpar++;
            } else {
                acumuladorimpar++;
            }
        }
        System.out.println("Quantidade de pares: " + acumuladorpar + "\n Quantidade de impares: " + acumuladorimpar);
    }

}
