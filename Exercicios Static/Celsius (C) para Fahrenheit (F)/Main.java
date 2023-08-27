public class Main {

    public static void main(String[] args) {
        double zeroCelsiusEmFahrenheit = ConversaoDeTemperatura.celsiusParaFahrenheit(0);
        double cemCelsiusEmFahrenheit = ConversaoDeTemperatura.celsiusParaFahrenheit(100);
        double cinquentaFahrenheitEmCelsius = ConversaoDeTemperatura.fahrenheitParaCelsius(50);

        System.out.println("0 graus Celsius correspondem a " + zeroCelsiusEmFahrenheit + " graus Fahrenheit");
        System.out.println("100 graus Celsius correspondem a " + cemCelsiusEmFahrenheit + " graus Fahrenheit");
        System.out.println("50 graus Fahrenheit correspondem a " + cinquentaFahrenheitEmCelsius + " graus Celsius");
    }
}
