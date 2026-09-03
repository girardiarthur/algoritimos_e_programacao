//Construir um algoritmo para imprimir:
//o cálculo da área de um círculo com raio de 5 cm. (π = 3.14159)
//área do círculo = π ˆ r2

//feito por: Arthur Girardi Noronha Tomei
package aula3;
public class ex10aula3 {
    public static void main (String []args){
        int raio = 5;
        double pi = Math.PI ;
        double area = pi * Math.pow(raio, 2);
        System.out.printf("A área do circulo é: %f centimetros",area);
    }
}
