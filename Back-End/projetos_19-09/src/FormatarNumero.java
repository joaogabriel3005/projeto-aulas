import java.util.Locale;
import java.text.NumberFormat;
public class FormatarNumero {
    public static void  main(String[]args){
        long numero = 1234567890;
        double numeroDecimal = 12345.67890;
        double porcentagem = 0.15;

        NumberFormat formato =NumberFormat.getInstance(new Locale("pt" ,"BR"));
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        NumberFormat formatoporcento =NumberFormat.getPercentInstance();

        formato.setMaximumFractionDigits(5);
        //formato.setMinimumFractionDigits(1);
        System.out.println("numero formatado pela configuração padrão do sistena operacional: "+ formato.format(numero));
        System.out.println("numeros decimais: "+ formato.format(numeroDecimal));
        System.out.println("Formatando moeda:  "+ formatoMoeda.format(numeroDecimal));
        System.out.println("Formatando Porcentagem:  "+ formatoporcento.format(porcentagem) );
    }
}
