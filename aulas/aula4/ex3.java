package aula4;
import java.util.Scanner;
//ARTHUR GIRARDI
public class ex3 {
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("DIGITE O PRIMEIRO NÚMERO");
    int numero1 = entrada.nextInt();
    System.out.println("DIGITE O SEGUNDO NÚMERO");
    int numero2 = entrada.nextInt();
    if (numero1 == numero2){
        System.out.println("NÚMEROS IGUAIS");
    }
    else if (numero1 > numero2 ){
        int diferenca = numero1 - numero2;
        System.out.print("A DIFERENÇA É: " + diferenca);
    }
    else{
        int diferenca = numero2 - numero1;
        System.out.println("A DIFERENÇA É: " + diferenca);
    }
        entrada.close();
    }
}
