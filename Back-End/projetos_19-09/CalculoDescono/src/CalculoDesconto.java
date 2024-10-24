import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoDesconto{
    public static void main (String[]args){
        double ValorDoProduto;
        double Desconto;
        double PDesconto;
        double PorcenDescoconto;

        NumberFormat formatonumero = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatonumero.setMinimumFractionDigits(2);

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o valor do produto");
        ValorDoProduto = entrada.nextDouble();

        System.out.println("digite o valor do desconto em porcentagen");
        PorcenDescoconto = entrada.nextDouble();

        Desconto = ValorDoProduto *(PorcenDescoconto/100);
        System.out.println();

        PDesconto = ValorDoProduto - Desconto;

        System.out.println("o valor original é :" + formatonumero.format(ValorDoProduto)+"R$");
        System.out.println("A porcentagen de Desconto é :" + formatonumero.format(PorcenDescoconto) +"%");
        System.out.println("o Valor do desconto é :"+ formatonumero.format(Desconto)+"R$");
        System.out.println("o valor final é :" + formatonumero.format(PDesconto)+"R$");


    }
}
