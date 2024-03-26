public class ComplexNumber {
    private double realNumber;
    private double imaginaryNumbers;
    public ComplexNumber(double realNumber, double imaginaryNumbers){
        this.realNumber = realNumber;
        this.imaginaryNumbers = imaginaryNumbers;
    }
    public double getReal() {
        return realNumber;
    }

    public void setReal(double real) {
        this.realNumber = real;
    }

    public double getImaginary() {
        return imaginaryNumbers;
    }

    public void setImaginary(double imaginary) {
        this.imaginaryNumbers = imaginary;
    }
}
