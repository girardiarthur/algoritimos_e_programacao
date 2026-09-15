package aula4;
import java.util.Scanner;
public class ex12 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SEU SALÁRIO");
        double salario = entrada.nextDouble();
        if(salario <= 600){
            System.out.println("VOCê ESTÁ ISENTO, SEU SÁLARIO ATUAL É DE: " + salario);
        }
        else if (salario > 600 && salario <= 1200){
            double inss = 0.2 * salario;
            salario = salario - inss;
            System.out.println("FOI DESCONTADO 20% PARA O INSS, SEU SALÁRIO LIQUIDO É: " + salario);
        }
        else if(salario > 1200 && salario <= 2000 ){
            double inss = 0.25 * salario;
            salario = salario - inss;
            System.out.println("FOI DESCONTADO 25% PARA O INSS, SEU SALÁRIO LIQUIDO É: " + salario);
        }
        else{
            double inss = 0.3 * salario;
            salario = salario - inss;
            System.out.println("FOI DESCONTADO 30% PARA O INSS, SEU SALÁRIO LIQUIDO É: " + salario);
        }
    }
}
