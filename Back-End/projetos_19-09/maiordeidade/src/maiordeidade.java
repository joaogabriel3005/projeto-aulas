import java.util.Scanner;

public class maiordeidade {
    public static void main(String[] args){
        int idadeBase= 18;
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        if (idade >= idadeBase){
            System.out.println("Voce é maior de idade 👌");
        }
            else {
                System.out.println("Voce é menor de idade 😒");
        }
    }
}
