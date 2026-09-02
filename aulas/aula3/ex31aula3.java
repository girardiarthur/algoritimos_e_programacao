//Construir um algoritmo para ler dois números inteiros e imprimir o seu produto

package aula3;
import java.util.Scanner;
public class ex31aula3{
    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int numero2 = entrada.nextInt();
        int resultado = numero1 * numero2;
        System.out.println("O produto entre os números digitados é: " + resultado);
        entrada.close();

    }
}