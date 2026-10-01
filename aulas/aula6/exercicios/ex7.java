package aula6.exercicios;
import java.util.Scanner;
public class ex7 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int cont,acumulador;
        double peso,imc,altura;
        cont = 1;
        acumulador = 0;
        do {
            System.out.println("Digite seu peso em kgs: ");
            peso = entrada.nextDouble();
            System.out.println("Digite sua altura em metros: ");
            altura = entrada.nextDouble();
            imc = peso / Math.pow(altura, 2);
            if (imc >= 18.5 && imc <=24.9){
                acumulador++;
            }

            cont++;
        }
        while(cont <= 10);
        System.out.println(acumulador + " PESSOAS SÃO CONSIDERADAS NÃO OBESAS");
    }
}
