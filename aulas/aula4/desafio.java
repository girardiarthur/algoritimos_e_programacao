package aula4;
import java.util.Scanner;
public class desafio {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SUA IDADE");
        int idade = entrada.nextInt();
        if(idade >= 16 ){
            System.out.println("ESTÁ APTO PARA VOTAR");
        }
        else{
            System.out.println("NÃO ESTÁ APTO PARA VOTAR");
        }
        entrada.close();
    }
}
