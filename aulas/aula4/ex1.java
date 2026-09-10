package aula4;
import java.util.Scanner;
// ARTHUR GIRARDI
public class ex1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        double numero = entrada.nextDouble();
        if (numero > 20){
           numero = numero /2;
            System.out.println("Seu número é maior que 20 e a metade dele é igual a: " + numero);
        }
        else {
            System.out.println("ERRO! DIGITE UM NÚMERO MAIOR QUE 20");
        }
        entrada.close();
    }
}
