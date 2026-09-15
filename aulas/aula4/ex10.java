package aula4;
import java.util.Scanner;
public class ex10 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        int num1 = entrada.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO");
        int num2 = entrada.nextInt();
        System.out.println("DIGITE O TERCEIRO NÚMERO");
        int num3 = entrada.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("O MAIOR NÚMERO É O: " + num1);
        } else if (num2 > num1 && num2 > num3 ){
            System.out.println("O MAIOR NÚMERO É O: " + num2);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println("O MAIOR NÚMERO É O: " + num3);
        }
        else{
            System.out.println("ELES SÃO IGUAIS");
        }
        entrada.close();
    }

}
