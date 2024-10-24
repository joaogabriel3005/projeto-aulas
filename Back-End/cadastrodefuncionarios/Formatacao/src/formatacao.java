import java.util.Locale;

public class formatacao {
    public static void main(String[]args){
        String nome = "Joelson";
        int idade = 47;
        double salario = 10000000.000;
        System.out.println(nome + "tem" + idade + "anos e ganha $" + salario);
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome,idade, salario);
        Locale.setDefault(new Locale(  "pt", "BR"));
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome,idade, salario);



    }


    }