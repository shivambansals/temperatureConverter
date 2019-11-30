import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureCoverter {
    double celsius;
    NumberFormat format = new DecimalFormat("#.#");

    public void celsiusToFahrenheit() {
        double fahrenheit = (9 * celsius) / 5 + 32;
        System.out.println(celsius + "C = " + format.format(fahrenheit) + "F");
    }

    public TemperatureCoverter(double celsius) {
        this.celsius = celsius;
    }
}

class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature in celcius is -");
        double c = scanner.nextDouble();
        TemperatureCoverter temperatureCoverter = new TemperatureCoverter(c);
        temperatureCoverter.celsiusToFahrenheit();
    }
}
