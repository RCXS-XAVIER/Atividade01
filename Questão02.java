
   
import java.util.Scanner;
public class Questão02 {
    //Escreva um programa para ler um número e o sistema vai mostra os números vizinhos, o anterior e o próximo número.

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite 1 número:");
            int n = ler.nextInt();
            // ler.close();
            System.out.print("Anterior: "+(n-1)+"\nPosterior: "+(n+1)+"\nNúmero digitado: "+n);
        }
    }
}

