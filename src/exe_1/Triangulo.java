package exe_1;

public class Triangulo extends Poligono {

    @Override
    public double calcArea() {
        return getBase() * getAltura() / 2;
    }

    @Override
    public double calcPerimetro() {
        return 3 * getBase();
    }

}
