package aula4;
import java.util.Scanner;
public class ex11 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE A IDADE DO ATLETA");
        int idade = entrada.nextInt();
        if(idade >= 5 && idade <= 7){
            System.out.println("CATEGORIA: INFATIL A");
        }
        else if (idade >= 8 && idade <=10){
            System.out.println("CATEGORIA: INFATIL B");
        }
        else if (idade >= 11 && idade <=13){
            System.out.println("CATEGORIA: JUVENIL A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("CATEGORIA: JUVENIL B");
        }
        else if (idade >= 18){
            System.out.println("CATEGORIA: SÊNIOR");
        }
        else {
            System.out.println("Não está apto para uma categoria");
        }
        entrada.close();
    }
}
