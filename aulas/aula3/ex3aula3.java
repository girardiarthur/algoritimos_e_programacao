//Imprima a tabuada do 5 usando printf

//feito por: Arthur Girardi Noronha Tomei
package aula3;
public class ex3aula3 {
    public static void main(String[] args) {
         int numero = 5;

        for (int multiplo = 1; multiplo <= 10; multiplo++) { // para 
            System.out.printf("%d x %d = %d%n", numero, multiplo, numero * multiplo);
        }

    }
}
