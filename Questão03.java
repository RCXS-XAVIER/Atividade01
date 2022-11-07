
    import java.util.Scanner;
public class Questão03 {
    // Escreva um programa para ler um nome digitado e mostrar a mensagem "Olá <nome-digitado>".
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        // ler.close();
        System.out.println("Olá, "+nome);
    }
}

    

