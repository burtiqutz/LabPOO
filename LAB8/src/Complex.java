public class Complex implements Numeric{
    private double real;
    private double imag;

    public Complex(){
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real){
        this.real = real;
    }
    public void setImag(double imag){
        this.imag = imag;
    }
    public double getReal(){
        return this.real;
    }
    public double getImag(){
        return this.imag;
    }

    @Override
    public Numeric add(Numeric n){
        Complex result = new Complex();
        if(n instanceof Complex){
            Complex b = (Complex)n;
            result.real += (this.real + b.real);
            result.imag += (this.imag + b.imag);
        }else {
            Fractie b = (Fractie)n;
            result.real += (this.real + b.getValue());

        }
        return result;
    }

    public Numeric sub(Numeric n){
        Complex res = new Complex();
        if(n instanceof Complex){
            Complex b = (Complex)n;
            res.real = this.real - b.real;
            res.imag = this.imag - b.imag;
        }else {
            Fractie b = (Fractie)n;
            res.real = this.real - b.getValue();
            res.imag = this.imag;
        }
        return res;
    }

    public Numeric mul(Numeric n){
        Complex res = new Complex();
        if(n instanceof Complex){
            Complex b = (Complex)n;
            res.real = (this.real * b.real) - (this.imag * b.imag);
            res.imag = (this.real * b.imag) + (this.imag * b.real);
        }else {
            Fractie b = (Fractie)n;
            res.real = this.real * b.getValue();
            res.imag = this.imag;
        }
        return res;
    }
    @Override
    public String toString(){
        if(this.imag < 0){
            return "nr complex este: " + this.real + this.imag + "i";
        }
        return "nr complex este: " + this.real + " + " + this.imag + "i";
    }
}
