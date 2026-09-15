package aula4;

import java.util.Scanner;

public class ex8 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SUA SENHA");
        String senha = entrada.nextLine();
        if(senha.equals("R10p5")){
            System.out.println("ACESSO CONCEDIDO");
        }
        else{
            System.out.println("ACESSO NEGADO! TENTE NOVAMENTE");
        }
        entrada.close();
    }
}
