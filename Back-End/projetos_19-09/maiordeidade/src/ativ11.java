import java.util.Scanner;
public class ativ11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua nota");
        double nota = entrada.nextDouble();

        System.out.println("Digite sua  frequencia em porcentagen");

        int frequencia = entrada.nextInt();

        if (frequencia < 75){
            System.out.println("Reprovado 🤣😭");
        }
        else {

            if (nota >= 7){

                System.out.println("Aprovado Parabens 👏👏");

            }
            else {
                if (nota >= 6 ){
                    System.out.println("Em recuperação 😖😖");
                }
                else {
                    System.out.println("Faça o curso de nivelamento 🐱‍👤🐱‍👤");
                }
            }


        }
        entrada.close();


    }
}