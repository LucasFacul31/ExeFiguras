package exe_1;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		Circulo c = new Circulo();
		figuras.add(c);
		Losango l = new Losango();
		figuras.add(l);
		Quadrado q = new Quadrado();
		figuras.add(q);
		Retangulo r = new Retangulo();
		figuras.add(r);
		Triangulo t = new Triangulo();
		figuras.add(t);

		for (int i = 0; i < figuras.size(); i++) {
			System.out.println(figuras.get(i).getClass().toString());
			System.out.println("Ã�rea: " + figuras.get(i).calcArea());
			System.out.println("PerÃ­metro: " + figuras.get(i).calcPerimetro() + "\n");
		}

		ArrayList<Poligono3d> figuras2 = new ArrayList<Poligono3d>();
		Cilindro cilindro = new Cilindro(5, 8, 4, 9);
		figuras2.add(cilindro);
		Cubo cubo = new Cubo(6, 6, 6);
		figuras2.add(cubo);
		Esfera esfera = new Esfera(3, 4, 4, 3);
		figuras2.add(esfera);
		Piramide piramide = new Piramide(8);
		figuras2.add(piramide);

		for (int i = 0; i < figuras2.size(); i++) {
			System.out.println(figuras2.get(i).getClass().toString());
			System.out.println("Volume: " + figuras2.get(i).calcVolume() + "\n");
		}
	}
}