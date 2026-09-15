package aula4;
import java.util.Scanner;
public class ex9 {
    public static void main (String []args){
       Scanner entrada = new Scanner(System.in);
       System.out.println("DIGITE SEU SALÁRIO BRUTO");
       double salario = entrada.nextDouble();
       System.out.println("DIGITE O VALOR DA PRESTAÇÃO");
       double prestacao = entrada.nextDouble();
       double porcentagem = 0.3 * salario;
       if(prestacao > porcentagem){
           System.out.println("O EMPRÉSTIMO PODE SER CONCEDIDO!");
       }
       else {
           System.out.println("O EMPRÉSTIMO NÃO PODE SER CONCEDIDO.");
       }
       entrada.close();
    }
}
