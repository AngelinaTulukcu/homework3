public class BMI {
    public static void main(String[] args) {
        double weight = 68.5; // Вес в килограммах
        double height = 1.75; // Рост в метрах

        double bmi = weight / (height * height); // Расчет индекса массы тела

        System.out.println("Индекс массы тела (BMI): " + bmi);
    }
}