//Faça um algoritmo para imprimir em cada linha o resultado
//lógico das seguintes expressões:
// ((120 - 30) = (3 ˆ 30))
// (não ((20 módulo 4)= 1) ou (9 != 9))
// ((5 módulo 2 ) > 3)
// (a = A)

//feito por: Arthur Girardi Noronha Tomei
package aula3;
public class ex7aula3 {
    public static void main (String[]args){
        boolean operacao1 = ((120 - 30) == Math.pow(3,30));
        boolean operacao2 = !((20 %4/2) == 1) || (9!=9);
        boolean operacao3 = ((5%2)>3);
        char A = 'A';
        char a = 'a';
        boolean operacao4 = (a == A);
        System.out.println("A operação 1 é: " + operacao1);
        System.out.println("A operação 2 é: " + operacao2);
        System.out.println("A operação 3 é: " + operacao3);
        System.out.println("A operação 4 é: " + operacao4);
    }
}
