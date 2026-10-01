package aula6.exercicios;

public class ex4 {
    public static void main(String[] args){
        double metade;
        int num = 10;
        do{
            metade = num /2;
            System.out.println("A METADE DE " + num + " É: " + metade);
            num++;
        }
        while (num <= 20);

    }
}
