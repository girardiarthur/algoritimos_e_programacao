//Faça um algoritmo que leia quatro números inteiros
//– calcule e mostre a soma desses números

package aula3;
import java.util.Scanner;
public class ex4aula3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = entrada.nextInt();
        System.out.println("Digite o quarto número");
        int numero4 = entrada.nextInt();
        int resultado = numero1 + numero2 + numero3 + numero4;
        System.out.printf("a soma dos números é: %d", resultado);
        entrada.close();
        


    }
}