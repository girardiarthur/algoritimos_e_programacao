package aula4;
import java.util.Scanner;
public class ex13 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        double num1 = entrada.nextDouble();
        System.out.println("DIGITE O SEGUNDO NÚMERO");
        double num2 = entrada.nextDouble();
        System.out.println("SELECIONE A OPERAÇÃO DESEJADA: \n -ADICÇÃO: + \n -SUBTRAÇÃO:  - \n -MULTIPLICAÇÃO: * \n -DIVISÃO: /");
        char operacao = entrada.next().charAt(0);
        if(operacao == '+'){
            double resultado = num1 + num2;
            System.out.println("A SOMA É IGUAL A: " + resultado);
        }
        else if(operacao == '-'){
            double resultado = num1 - num2;
            System.out.println("A SUBTRAÇÃO É IGUAL A: " + resultado);
        }
        else if(operacao == '*'){
            double resultado = num1 * num2;
            System.out.println("A MULTIPLICAÇÃO É IGUAL A: " + resultado);
            }
        else if (operacao == '/'){
                if(num2 <= 0){
                    System.out.println("IMPOSSIVEL DIVIDIR!!");
                }
                else {
                    double resultado = num1 / num2;
                    System.out.println("A DIVISÃO É IGUAL A: " + resultado);
                }
        }
        else{
            System.out.println("OPERAÇÃO INVÁLIDA! TENTE NOVAMENTE.");
        }
        entrada.close();
    }
}
