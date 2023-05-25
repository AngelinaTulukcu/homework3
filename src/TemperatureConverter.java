public class TemperatureConverter {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // Температура в градусах Цельсия

        double fahrenheitTemperature = celsiusTemperature * 9/5 + 32; // Конвертация в градусы Фаренгейта

        System.out.println("Температура в градусах Фаренгейта: " + fahrenheitTemperature);
    }
}
