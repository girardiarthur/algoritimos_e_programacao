//Faça um algoritmo que receba um número, calcule e mostre:
//O número elevado ao quadrado;
//O número elevado ao cubo;
//A raiz quadrada do número digitado;
//O número elevado a potência 10;

//feito por: Arthur Girardi Noronha Tomei
package aula3;
import java.util.Scanner;
public class ex12aula3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        double numero = entrada.nextDouble();
        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raiz = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);
        System.out.println("O número ao quadrado: " + quadrado);
        System.out.println("O número ao cubo: " + cubo);
        System.out.printf("O a raiz quadrada é: %.2f %n", raiz);
        System.out.println("O número elevado a potência de 10: " + potencia10);
        entrada.close();
    }
}