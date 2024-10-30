public class Complex {
    private int real;
    private int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this(0, 0);
    }

    public void addComplex(Complex c1) {
        this.real += c1.real;
        this.imag += c1.imag;
    }

    public void subComplex(Complex c1) {
        this.real -= c1.real;
        this.imag -= c1.imag;
    }

    public void mulScalar(int k) {
        this.real *= k;
        this.imag *= k;
    }

    public void mulComplex(Complex c1) {
        this.real = this.real * c1.real - this.imag * c1.imag;
        this.imag = this.real * c1.imag + this.imag * c1.real;
    }

    public int getReal() {
        return real;
    }

    public int getImag() {
        return imag;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }


    public String toString() {
        if (this.imag >= 0) {
            return this.real + " + " + this.imag + "i";
        } else {
            return this.real + " - " + (-this.imag) + "i";
        }
    }
}
