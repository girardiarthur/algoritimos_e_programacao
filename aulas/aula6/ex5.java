package aula6;

public class ex5 {
    public static void main (String[] args){
        int mult, tabuada, resultado;
        mult = 0;
        tabuada = 5;

        while (mult <= 10){
            resultado = tabuada * mult;
            System.out.println(tabuada + " * " + mult + " É igual a : " + resultado);
            mult++;
        }
    }
}
