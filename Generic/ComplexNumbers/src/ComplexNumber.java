public class ComplexNumber<T extends Number> {
    private T real;
    private T imaginary;

    public ComplexNumber(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public T getImaginary() {
        return imaginary;
    }

    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber<T> add(ComplexNumber<T> other) {
        T newReal = add(this.real, other.real);
        T newImaginary = add(this.imaginary, other.imaginary);
        return new ComplexNumber<>(newReal, newImaginary);
    }

    public ComplexNumber<T> multiply(ComplexNumber<T> other) {
        T newReal = subtract(multiply(this.real, other.real), multiply(this.imaginary, other.imaginary));
        T newImaginary = add(multiply(this.real, other.imaginary), multiply(this.imaginary, other.real));
        return new ComplexNumber<>(newReal, newImaginary);
    }

    private T add(T a, T b) {
        return (T) (Number) (a.doubleValue() + b.doubleValue());
    }

    private T subtract(T a, T b) {
        return (T) (Number) (a.doubleValue() - b.doubleValue());
    }

    private T multiply(T a, T b) {
        return (T) (Number) (a.doubleValue() * b.doubleValue());
    }


}
