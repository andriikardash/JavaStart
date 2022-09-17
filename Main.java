public class Main {

    //convert Fahrenheit to Celsius
    static double convertToCelsius(double degreeFahrenheit) {
        return (degreeFahrenheit - 32) / 1.8;
    }

    //convert inch to sm
    static double convertToSM(double inch) {
        return inch * 2.54;
    }

    //find max value
    static double maxValue(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        //System.out.println(convertToCelsius(68.3));
        //System.out.println(convertToSM(2.1));
        //System.out.println(maxValue(5, 5.1, 6));
        // Останнє завдання не знав, як зробити =\
    }
}
