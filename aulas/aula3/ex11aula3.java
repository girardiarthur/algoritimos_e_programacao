//Construir um algoritmo que leia:
//o ano de nascimento de uma pessoa e o ano atual.
//Calcule e mostre:
//a idade dessa pessoa;
//quantos anos essa pessoa terá em 2030.

//feito por: Arthur Girardi Noronha Tomei
package aula3;
import java.util.Scanner;
public class ex11aula3 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        int anonascimento = entrada.nextInt();
        int anoatual = 2026;
        int idade = anoatual - anonascimento;
        int idade2030 = 2030 - anonascimento;
        System.out.println("Você tem: " + idade + " anos de idade \nEm 2030 você terá: " + idade2030 + " anos de idade" );
        entrada.close();
    }
}

