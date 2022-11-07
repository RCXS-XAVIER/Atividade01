
    import java.util.Scanner;
    public class Questão04 {
       //Escreva um programa para ler o nome, valor da hora, quantas horas trabalhadas, o sistema vai apresentar o salário.
    //<fulano> vai receber R$<00.00>
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = ler.nextLine();
            System.out.println("Valor da hora:");
            float valorHora = ler.nextFloat();
            System.out.println("Quantas horas trabalhadas:");
            float totalHora = ler.nextFloat();
            // ler.close();
            float salario = valorHora * totalHora;
            System.out.println(nome+" vai receber "+ salario);
        }   
}
