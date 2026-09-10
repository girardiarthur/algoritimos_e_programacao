package aula4;
import java.util.Scanner;
//ARTHUR GIRARDI
public class ex5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        int numero = entrada.nextInt();
        if(numero >= 50 && numero <= 100){
            System.out.println("PERTENCE AO INTERVALO");
        }
        else{
            System.out.println("NÃO PERTENCE AO INTERVALO");
        }
        entrada.close();
    }
}
