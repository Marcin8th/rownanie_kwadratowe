import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("a=");
            a = sc.nextFloat();

            System.out.print("b=");
            b = sc.nextFloat();

            System.out.print("c=");
            c = sc.nextFloat();

            try {
                calculator.calculate(a, b, c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
