import java.util.Scanner;
public class verifiqueAluno {
    public static void main(String[]args){
        String aluno = "João";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeInput = scanner.nextLine();
        if (nomeInput.equals(aluno)) {
            System.out.println("voce é " + aluno + "pode entrar");
        } else {
            System.out.println("Voce não é " + aluno + " tá de brincadeira");
        }
        scanner.close();
    }
}
