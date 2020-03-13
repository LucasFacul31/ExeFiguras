package exe_1;

public abstract class Figura {
	private double base;
	private double altura;

	public Figura(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public abstract double calcArea();

	public abstract double calcPerimetro();

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
