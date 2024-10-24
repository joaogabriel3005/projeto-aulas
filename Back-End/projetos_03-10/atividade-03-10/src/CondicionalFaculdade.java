import java.util.Scanner;
public class CondicionalFaculdade {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        System.out.println("digite sua idade");
        int idade= entrada.nextInt();

        System.out.println("Digite sua media final");
        double media= entrada.nextDouble();
        String mensagem = (media>=7 && idade>=17)
                ?"Aprovado preste o Vestibular"
                : "Voce não pode prestar o Vestibular 😢";
        System.out.println(mensagem);
        entrada.close();
    }
}
