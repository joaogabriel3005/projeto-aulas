import java.util.Scanner;
public class EstadoCivil {
    public static void main(String[] args) {
        String EstadoCivil;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique seu Estado Civil soltlteiro(a), casado(a), Viuvo(a)");
        EstadoCivil = entrada.nextLine();
        System.out.println("Digite seu Nome");
        nome = entrada.nextLine();
        if (EstadoCivil.equalsIgnoreCase("Solteiro")||(EstadoCivil.equalsIgnoreCase("Solteira"))){
            System.out.println("Você" + nome + EstadoCivil);
        }
        else {
            if (EstadoCivil.equalsIgnoreCase("Casado")||(EstadoCivil.equalsIgnoreCase("Casada"))){
                System.out.println("Você" + nome + EstadoCivil);
            }
            else {
                if ((EstadoCivil.equalsIgnoreCase("Viuvo")||(EstadoCivil.equalsIgnoreCase("Viuva")))){
                    System.out.println("Você" + nome + EstadoCivil);
                }
            }
        }
    }
}
