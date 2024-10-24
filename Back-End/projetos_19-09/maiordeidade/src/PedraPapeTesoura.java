import java.util.Scanner;
import java.util.Random;
public class PedraPapeTesoura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        //0 Pedra, 1 Papel, 2 Tesoura

        int escolhaComputador = gerador.nextInt(2);
        System.out.print(" Escolha um entre (Pedra, Papel, Tesoura):  ");
        String escolhaUsuario = entrada.nextLine();
        String resultado = "";
        String escolhatextMaquina = "";

        if (escolhaUsuario.equalsIgnoreCase("Pedra")){
            if (escolhaComputador == 0){
                resultado = "Empate";
                escolhatextMaquina = "Pedra";
            } else if (escolhaComputador == 1){
                resultado = "Voce Perdeu";
                escolhatextMaquina = "Papel";
            }else if (escolhaComputador == 2){
                resultado = "Voce Veneu";
                escolhatextMaquina = "Tesoura";
            }else if (escolhaComputador == 2){
                resultado = "Voce Veneu";
                escolhatextMaquina = "Tesoura";
                }
            System.out.println("Escolha do Computador:  " + escolhatextMaquina);
        } else if (escolhaUsuario.equalsIgnoreCase("Papel")){
            if (escolhaComputador == 0){
                resultado = "Voce Perdeu";
                escolhatextMaquina = "Pedra";
            } else if (escolhaComputador == 1){
                resultado = "Empate";
                escolhatextMaquina = "Papel";
            }else if (escolhaComputador == 2) {
                resultado = "Voce Perdeu";
                escolhatextMaquina = "Tesoura";
            }
            System.out.println("Escolha do Computador:  " + escolhatextMaquina);
    }else if (escolhaUsuario.equalsIgnoreCase("Tesoura")){
            if (escolhaComputador == 0){
                resultado = "Empate";
                escolhatextMaquina = "Pedra";
            } else if (escolhaComputador == 1){
                resultado = "Voce Perdeu";
                escolhatextMaquina = "Papel";
            }else if (escolhaComputador == 2){
                resultado = "Voce Veneu";
                escolhatextMaquina = "Tesoura";
            }else if (escolhaComputador == 2){
                resultado = "Voce Veneu";
                escolhatextMaquina = "Tesoura";
            }
            System.out.println("Escolha do Computador:  " + escolhatextMaquina);
        }else if (escolhaUsuario.equalsIgnoreCase("Tesoura")){
            if (escolhaComputador == 0){
                resultado = "Voce Perdeu";
                escolhatextMaquina = "Pedra";
            } else if (escolhaComputador == 1){
                resultado = "Voce Venceu";
                escolhatextMaquina = "Papel";
            }else if (escolhaComputador == 2){
                resultado = "Empate";
                escolhatextMaquina = "Tesoura";
            }
            System.out.println("Escolha do Computador:  " + escolhatextMaquina);
        }else {
            resultado = "Escolha do Usuario Invalida! Escolha entre Pedra, Papel, Tesoura";
        }
        System.out.println(resultado);
    }
}

