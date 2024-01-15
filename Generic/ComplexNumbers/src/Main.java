public class Main {
    public static void main(String[] args) {
        ComplexNumber<Integer> complex1 = new ComplexNumber<>(2, 3);
        ComplexNumber<Integer> complex2 = new ComplexNumber<>(-1, 2);

        ComplexNumber<Integer> sum = complex1.add(complex2);
        ComplexNumber<Integer> product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}