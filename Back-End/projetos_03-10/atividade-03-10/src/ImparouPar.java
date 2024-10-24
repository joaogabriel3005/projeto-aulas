import java.util.Scanner;
public class ImparouPar {
    public static void main(String[] args) {
        int conta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:  ");
        int numero = entrada.nextInt();

        String menssagem = (numero%2==0)
                ?"Par😁👍"
                : "Impar🤔";
        System.out.println(menssagem);
        entrada.close();
    }
}
