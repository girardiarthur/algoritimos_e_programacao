package aula5.exercicios;
import java.util.Scanner;
public class ex3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INFORME O PERIODO");
        System.out.println("DIGITE:\nM - MATUTINO\nV - VESPERTINO\nN - NOTURNO");
        char periodo = entrada.next().charAt(0);

        switch (periodo){
            case 'M':
            case 'm':
            System.out.println("BOM DIA!");
                break;

            case 'V':
            case 'v':
                System.out.println("BOA TARDE!");
                break;

            case 'N':
            case 'n':
                System.out.println("BOA NOITE!");
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE");
        }
        entrada.close();
    }
}
