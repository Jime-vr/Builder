package calcularComidaBuilder;

import calculadoracomida.Medida;
import calcularComidaBuilder.Comida;
import calcularComidaBuilder.Comida.ComidaBuilder;
public class CreateComida {

public static void main(String[] args) {
	
		Comida comida;
		ComidaBuilder builder = new Comida.ComidaBuilder("Papa", Medida.G);
		builder = builder.porcion(100).calorias(77).carbohidratos(17).sodio(6).carbohidratos(17);
		comida = builder.crearComida();
		System.out.println(comida.toString());
		
		
	}
}
