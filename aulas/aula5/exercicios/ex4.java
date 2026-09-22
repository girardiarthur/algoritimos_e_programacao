package aula5.exercicios;
import java.util.Scanner;
public class ex4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SEU PLANO DE TRABALHO");
        char plano = entrada.next().charAt(0);
        System.out.println("DIGITE SEU SÁLÁRIO ATUAL");
        double salario = entrada.nextDouble();
        switch (plano){

            case 'A':
            case 'a':
                salario = 0.10 * salario + salario;
                System.out.println("SEU NOVO SALÁRIO É DE: " + salario);
                break;

            case 'B':
            case 'b':
                salario = 0.15 * salario + salario;
                System.out.println("SEU NOVO SALÁRIO É DE: " + salario);
                break;

            case 'C':
            case 'c':
                salario = 0.20 * salario + salario;
                System.out.println("SEU NOVO SALÁRIO É DE: " + salario);
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
            entrada.close();
    }
}
