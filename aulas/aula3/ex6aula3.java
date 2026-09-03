//Faça um algoritmo que calcule e imprima o valor de cada
//expressão a seguir:
//– (20 - 15)/2
//– 2 ˆ (5/20) + 30 / (15 ˆ 2)
//– 35 / (6 + 2)
//– 23 módulo 4

//feito por: Arthur Girardi Noronha Tomei
package aula3;
public class ex6aula3 {
    public static void main (String[] args){
        double conta1 = (20 - 15) /2.0 ;
        double conta2 = Math.pow(2, (5.0/20.0)) + 30.0/(Math.pow(15,2));
        double conta3 = 35.0/(6+2);
        double conta4 = 23%4;
        System.out.printf("O RESULTADO DA OPERAÇÃO 1 É : %.2f %n", conta1);
        System.out.printf("O RESULTADO DA OPERAÇÃO 2 É : %.2f %n", conta2);
        System.out.printf("O RESULTADO DA OPERAÇÃO 3 É : %.2f %n", conta3);
        System.out.printf("O RESULTADO DA OPERAÇÃO 4 É : %.2f %n", conta4);

        }
    }

