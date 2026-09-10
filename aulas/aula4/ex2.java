package aula4;
import java.util.Scanner;
//ARTHUR GIRARDI
public class ex2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SUA IDADE: ");
        int idade = entrada.nextInt();
        if(idade >= 18 ){
            System.out.println("VOCÊ É MAIOR DE IDADE");
        }
        else {
            System.out.println("VOCÊ É MENOR DE IDADE");
        }
        entrada.close();
    }

}
