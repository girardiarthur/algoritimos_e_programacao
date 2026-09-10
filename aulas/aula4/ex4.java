package aula4;
import java.util.Scanner;
//ARTHUR GIRARDI
public class ex4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double numero1 = entrada.nextDouble();
        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double numero2 = entrada.nextDouble();
        if(numero1 > numero2){
            System.out.println("Maior número: " + numero1 + "\nMenor número: " + numero2);
        }
        else{
            System.out.println("Maior número: " + numero2 + "\nMenor número: " + numero1);
        }
        entrada.close();
    }
}
