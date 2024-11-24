public class Fractie implements Numeric {
    private double value;

    public Fractie() {
        this.value = 0;
    }

    public Fractie(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Numeric add(Numeric n) {
        if (n instanceof Fractie) {
            Fractie res = new Fractie();
            Fractie nn = (Fractie) n;
            res.value = this.value + nn.value;
            return res;
        } else if (n instanceof Complex) {
            Complex nn = (Complex) n;
            Complex res = new Complex();
            res.setReal(nn.getReal() + this.value);
            res.setImag(nn.getImag());
            return res;
        }
        return null;
    }

    public Numeric sub(Numeric n) {
        if (n instanceof Fractie) {
            Fractie res = new Fractie();
            Fractie nn = (Fractie) n;
            res.value = this.value - nn.value;
            return res;
        } else if (n instanceof Complex) {
            Complex nn = (Complex) n;
            Complex res = new Complex();
            res.setReal(nn.getReal() - this.value);
            res.setImag(nn.getImag());
            return res;
        }
        return null;
    }

    public Numeric mul(Numeric n) {
        if (n instanceof Fractie) {
            Fractie res = new Fractie();
            Fractie nn = (Fractie) n;
            res.value = this.value * nn.value;
            return res;
        } else if (n instanceof Complex) {
            Complex nn = (Complex) n;
            Complex res = new Complex();
            res.setReal(nn.getReal() * this.value);
            res.setImag(nn.getImag());
            return res;
        }
        return null;
    }

    @Override
    public String toString() {
        return  "fractia este: " + value;
    }
}
