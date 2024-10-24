import java.util.Locale;
public class variaveis {
    public static void main(String[] args) {
        String product1 = "Computador";
        String product2 = "Mesa de Escritório";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double medida = 53.234567;
        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é R$ %.2f%n", product1, price1);
        System.out.printf("%s, cujo preço é R$ %.2f%n", product2, price2);
        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Registro: %s anos, código %d e gênero: %c%n", idade, codigo, genero);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f", medida);
    }
}
