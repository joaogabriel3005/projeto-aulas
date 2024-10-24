import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;
public class operadores {
    public static void main(String[]args){
        int numero1;
        int numero2;
        float resultado;
        NumberFormat formatonumeros =NumberFormat.getInstance(new Locale("pt" ,"BR"));
        formatonumeros.setMinimumFractionDigits(0);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:  ");
        numero1 = entrada.nextInt();
        System.out.println("Digite outro número");
        numero2 = entrada.nextInt();

        //Adição
        resultado = numero1 + numero2;
        System.out.println("Soma de " +  numero1 + " + " + numero2 + "é igual a: " + resultado);

        //Subtração
        resultado = numero1 - numero2;
        System.out.println("Subtração de " + formatonumeros.format(numero1) + "-" + formatonumeros.format(numero2) + "é igual a: " + resultado);




        entrada.close();
    }
}
