package exe_1;

public abstract class Poligono extends Figura {
	private double base;
	private double altura;

    @Override
    public double calcArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
