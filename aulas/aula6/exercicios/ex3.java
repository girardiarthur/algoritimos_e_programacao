package aula6.exercicios;
import java.util.Scanner;
public class ex3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, sequencia;
        sequencia = 1;
        System.out.println("Digite um número inteiro:");
        num = entrada.nextInt();
        while(sequencia <= num){
            System.out.println(sequencia);
            sequencia *= 2;
        }
        entrada.close();
    }
}
