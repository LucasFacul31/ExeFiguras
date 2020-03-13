package atividade;

public class Cubo extends Poligono3d {
	public Cubo(double base, double altura, double profundidade) {
		super(base, altura, profundidade);
	}
	
	public Cubo() {
		super();
	}

	@Override
	public double calcVolume() {
		return getBase() * getAltura() * getProfundidade();
	}
	
}
