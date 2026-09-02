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
