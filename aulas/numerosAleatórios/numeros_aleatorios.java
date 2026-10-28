package numerosAleatórios;
import java.util.Random;
public class numeros_aleatorios {
    public static void main (String[]args){
        Random gerador = new Random();
        int sorteado = 0 + gerador.nextInt(90 + 1);
                System.out.println(sorteado);
                System.out.println("Numero sorteado é: " + sorteado);
//teste
            }
}


