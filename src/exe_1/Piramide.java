package exe_1;

public class Piramide extends Poligono3d {
	@Override
	public double calcVolume() {
		return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
	}
}
