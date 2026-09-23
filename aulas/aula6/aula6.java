package aula6;
import java.util.Scanner;
public class aula6 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        double nota, media, acumuladorNotas;
        acumuladorNotas = 0;

        while (contador < 5){
            contador ++;
            System.out.println("Digite uma nota:" + contador);
            nota = entrada.nextDouble();
            acumuladorNotas = acumuladorNotas + nota;
        }
        media =  acumuladorNotas/contador;
        System.out.println("A média final é: " + media);
    }
}
