public class NumberRounding {
    public static void main(String[] args) {
        double originalNumber = 3.14159;

        int roundedNumber = (int) Math.round(originalNumber);

        System.out.println("Исходное значение: " + originalNumber);
        System.out.println("Округленное значение: " + roundedNumber);
    }
}
