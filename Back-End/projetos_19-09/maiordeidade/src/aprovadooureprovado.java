import java.util.Scanner;

    public class aprovadooureprovado {
        public static void main(String[] args) {
            int NotaMinima = 6;
            int idade;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite sua media: ");
            idade = entrada.nextInt();
            if (idade >= NotaMinima){
                System.out.println("Voce foi aprovado ✔");
            }
            else {
                System.out.println("Voce foi reprovado 🤦‍♂️");
            }
        }
    }


