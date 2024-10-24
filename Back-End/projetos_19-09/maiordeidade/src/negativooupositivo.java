import java.util.Scanner;
public class negativooupositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero >0) {
            System.out.println("Seu numero " + numero + " é Positivo");
        } else if (numero < 0) {
            System.out.println("Seu número " + numero + " é Negativo.");
        } else {
            System.out.println("Seu número é zero.");
        }
        entrada.close();
    }
}
