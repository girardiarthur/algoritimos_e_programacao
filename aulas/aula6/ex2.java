package aula6;
import java.util.Scanner;
public class ex2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int contador, acumuladorimp, acumuladorpar,num;
        contador = 1;
        acumuladorimp = 0;
        acumuladorpar = 0;
        while(contador <= 10){
            System.out.println("Digite o número " + contador );
            num = entrada.nextInt();
            contador++;

            if(num % 2 == 0){
               acumuladorpar++ ;
            }
            else{
                acumuladorimp++;
            }
        }
        System.out.println("QUANTIDADE DE PARES: " + acumuladorpar);
        System.out.println("QUANTIDADE DE IMPARRES: " + acumuladorimp);
        entrada.close();
    }
}
