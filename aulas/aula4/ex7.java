package aula4;
import java.util.Scanner;
public class ex7 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("DIGITE SEU SALÁRIO");
        double salario = entrada.nextDouble();
        System.out.println("DIGITE QUANTOS ANOS VOCÊ TRABALHA NA EMPRESA");
        int anos = entrada.nextInt();

        if(anos >= 5 ){
            double bonus = 0.2 * salario;
            salario = salario + bonus;
            System.out.println("SEU BONUS É DE: " + bonus + " REAIS");
            System.out.println("SEU SALARIO TOTAL É DE: " + salario);
        }
        else {
            double bonus = 0.1 * salario;
            salario = salario + bonus;
            System.out.println("SEU BONUS É DE: " + bonus + " REAIS");
            System.out.println("SEU SALARIO TOTAL É DE: " + salario);
        }
        entrada.close();
    }
}
