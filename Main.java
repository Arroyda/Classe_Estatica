// Classe principal para executar as conversões
public class Main {
    public static void main(String[] args) {
        // Exemplo de conversões
        double celsius = 25.0;
        double quilometros = 100.0;
        double gramas = 500.0;

        // Chama os métodos da classe ConversorUnidades e armazena os resultados
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
        double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
        double libras = ConversorUnidades.gramasParaLibras(gramas);

        // Exibindo os resultados no console
        System.out.println(celsius + " °C é igual a " + fahrenheit + " °F");
        System.out.println(quilometros + " km é igual a " + milhas + " milhas");
        System.out.println(gramas + " g é igual a " + libras + " lbs");
    }
}
