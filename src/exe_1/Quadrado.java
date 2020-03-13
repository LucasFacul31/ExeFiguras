package exe_1;

public class Quadrado extends Poligono implements Diagonal {

    @Override
    public double calcPerimetro() {
        return 4 * getBase();
    }

    @Override
    public double calcDiagonal() {
        return getBase() * Math.sqrt(2);
    }

}
