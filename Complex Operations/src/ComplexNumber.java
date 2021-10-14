public class ComplexNumber {

    private double real,imaginary;

    public ComplexNumber(double real, double imaginary){

        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){

        double realPart = this.real + real;
        double imaginaryPart = this.imaginary + imaginary;

        this.real = realPart;
        this.imaginary = imaginaryPart;

    }
    public void add(ComplexNumber x){
        double a = x.getReal();
        double b = x.getImaginary();

        double realPart = this.real + a;
        double imaginaryPart = this.imaginary + b;

        this.real = realPart;
        this.imaginary = imaginaryPart;

    }

    public void subtract(double real, double imaginary){

        double realPart = this.real - real;
        double imaginaryPart = this.imaginary - imaginary;

        this.real = realPart;
        this.imaginary = imaginaryPart;

    }
    public void subtract(ComplexNumber x){
        double a = x.getReal();
        double b = x.getImaginary();

        double realPart = this.real - a;
        double imaginaryPart = this.imaginary - b;

        this.real = realPart;
        this.imaginary = imaginaryPart;

    }

}
