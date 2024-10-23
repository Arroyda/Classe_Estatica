// Classe estática para conversões de unidades
public class ConversorUnidades {
    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter quilômetros para milhas
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371;
    }

    // Método para converter gramas para libras
    public static double gramasParaLibras(double gramas) {
        return gramas * 0.00220462;
    }
}