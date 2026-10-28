package numerosAleatórios;
import java.util.Random;
public class numeros_aleatorios {
    public static void main (String[]args){
        Random gerador = new Random();
        boolean gay = true;
        int sorteado;
         while(gay == true) {
             sorteado = 10 + gerador.nextInt(90 + 1);
             System.out.println(sorteado);
            if (sorteado == 24){
                System.out.println("GAAAAY");
                gay = false;
            }        }

    }
}
