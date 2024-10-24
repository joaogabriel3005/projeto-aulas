import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

 public class cauculodetroco {
    public static void main(String[] args) {
       double compra;
        double valorpago;
        double troco;
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        formato.setMinimumFractionDigits(3);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Valor da Compra: ");
        compra = entrada.nextInt();
        System.out.println("Digite o Valor Pago: ");
        valorpago = entrada.nextDouble(); // Alterado para nextDouble()

        troco = valorpago - compra;
        System.out.println("O valor da Compra é: " + formato.format(compra) + ", o valor pago: " + formato.format(valorpago));
        System.out.println("O troco a ser recebido é: " + formato.format(troco));

        entrada.close(); // Fechando o Scanner
    }
}

