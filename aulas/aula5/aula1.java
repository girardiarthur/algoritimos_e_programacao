package aula5;
// switch case
import javax.security.auth.DestroyFailedException;
import java.util.Scanner;
public class aula1 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------MENU--DE--OPÇÕES--------");
        System.out.println("1- Cadastrar produtos");
        System.out.println("2- listar produtos");
        System.out.println("3- Sair do sistema");
        int menu = entrada.nextInt();

        switch (menu){
            case 1:
                System.out.println("VOCÊ ESCOLHEU A OPÇÃO 1. \n QUE CADASTRA PRODUTOS");
                break;
            case 2:
                System.out.println("VOCÊ ESCOLHEU A OPÇÃO 2 \n QUE LISTA PRODUTOS");
                break;
            case 3:
                System.out.println("VOCÊ ESCOLHEU A OPÇÃO 3 \n QUE SAI DO SISTEMA");
                break;

            default:
                System.out.println("OPÇÃO DE MENU INVÁLIDA!");
        }
        entrada.close();
    }
}
