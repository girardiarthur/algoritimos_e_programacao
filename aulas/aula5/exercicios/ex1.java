package aula5.exercicios;
import java.util.Scanner;
public class ex1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO");
        int dia = entrada.nextInt();

        switch(dia){
            case 1:
                System.out.println("É DOMINGO");
                break;

            case 2:
                System.out.println("É SEGUNDA");
                break;

            case 3:
                System.out.println("É TERÇA");
                break;

            case 4:
                System.out.println("É QUARTA");
                break;

            case 5:
                System.out.println("É QUINTA");
                break;

            case 6:
                System.out.println("É SEXTA");
                break;

            case 7:
                System.out.println("É SÁBADO");
                break;


            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
            entrada.close();
    }
}
