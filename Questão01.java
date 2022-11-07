import java.util.Scanner;

public class Questão01 {
    //Escreva um programa para ler 2 notas, o sistema vai apresentar a média final, 
    //se nota maior que 7 incluir mensagem "aprovado" senão "reprovado".

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite Nota1:");
        double nota01 = ler.nextDouble();
        System.out.println("Digite Nota2:");
        double nota02 = ler.nextDouble();
        // ler.close();
        double media = (nota01 + nota02) / 2;
        System.out.println("Média Final: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
