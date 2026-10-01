package aula6.exercicios;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double nota1,nota2,media;
        int cont;
        cont = 1;

        while (cont <= 5) {
            do {
                System.out.println("DIGITE A SUA PRIMEIRA NOTA: ");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.println("DIGITE A SUA SEGUNDA NOTA: ");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;
            System.out.println("A MÉDIA DO ALUNO " + cont + " é " + media);
            cont++;
        }
    }
}
