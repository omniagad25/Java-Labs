
package equation;

public class quadraticFunction {

    public static void main(String[] args) {
        equationInterface eq = (double a, double b, double c) -> {
            double discriminant = b * b - 4 * a * c;

            if (discriminant >= 0 && a != 0) {
                double firstRoot = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double secondRoot = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("First Root: " + firstRoot);
                System.out.println("Second Root: " + secondRoot);
            } else {
                System.out.println("No real roots.");
            }
        };

        eq.calculateRoots(1, -3, 2);

    }
}

