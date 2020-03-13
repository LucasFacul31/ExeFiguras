package exe_1;

public abstract class Poligono extends Figura {

	public Poligono(double base, double altura) {
		super();
		setBase(base);
		setAltura(altura);
	}

	public Poligono(double base) {
		super();
		setBase(base);
	}

	public double calcArea() {
		return super.getBase() * super.getAltura();
	}

	public double getBase() {
		return super.getBase();
	}

	public void setBase(double base) {
		super.setBase(base);
	}

	public double getAltura() {
		return super.getAltura();
	}

	public void setAltura(double altura) {
		super.setAltura(altura);
	}
}
