package aula2;
   import java.util.Scanner;
   public class lista {
      public static void main(String[]args){
         System.out.println("lista de seus 5 livros favoritos");


         Scanner entrada = new Scanner(System.in);
         System.out.println("\nqDigite qual é seu primeiro livro favorito:");
         String livro1 = entrada.nextLine();

          System.out.println("Digite qual é seu segundo livro favorito:");
          String livro2 = entrada.nextLine();

           System.out.println("Digite qual é seu terceiro livro favorito:");
           String livro3 = entrada.nextLine();

            System.out.println("Digite qual é quarto seu livro favorito:");
            String livro4 = entrada.nextLine();

             System.out.println("Digite qual é seu quinto livro favorito:");
             String livro5 = entrada.nextLine();


             
             System.out.println("\nSUA LISTA DE LIVROS:"); 
            
             System.out.println("\nPRIMEIRO: " + livro1);
             System.out.println("SEGUNDO: " + livro2);
             System.out.println("TERCEIRO: " + livro3);
             System.out.println("QUARTO: " + livro4);
             System.out.println("QUINTO: " + livro5);


         
      }
   }