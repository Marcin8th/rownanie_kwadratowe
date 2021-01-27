public class Calculator {

    public String calculate(double a, double b, double c) {
        if (a != 0) {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                throw new SquareEquationException("Brak rozwiązań (delta < 0)");
            } else if (delta == 0) {
                double x;
                x = -b / (2 * a);
                return String.format("Jedno podwójne rozwiązanie x = %f", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return String.format("Istnieją dwa rozwiązania x1 = %f oraz x2 = %f", x1, x2);
            }
        } else {
            throw new SquareEquationException("Parametr a == 0");
        }
    }
}
