// Faça um algoritmo para apresentar:
// o cálculo da média das seguintes notas 8.0, 7.5, 4.5 e 9.0

package aula3;
public class ex8aula3 {
    public static void main (String[]args){
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 4.5;
        double nota4 = 9.0;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média de suas notas é: %.2f",media);
    }
}
