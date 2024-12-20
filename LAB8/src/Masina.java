public class Masina implements Cloneable{
    private String marca;
    private String color;
    public Masina(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Masina{" + "marca=" + marca + ", color=" + color + '}';
    }
}
