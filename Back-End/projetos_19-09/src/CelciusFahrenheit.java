import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class CelciusFahrenheit {
    public static void main(String[]args){
        int celsius;
        float resultado;
        NumberFormat formatonumeros =NumberFormat.getInstance(new Locale("pt" ,"BR"));
        formatonumeros.setMinimumFractionDigits(1);
        Scanner entrada = new Scanner(System.in);

        //Conversão
        System.out.println("Digite a temperatura em graus celcius:  ");
        celsius = entrada.nextInt();
        resultado = (celsius * 9 / 5) + 32;
        System.out.println("Resultado da conversão é: " + resultado);


    }
}
