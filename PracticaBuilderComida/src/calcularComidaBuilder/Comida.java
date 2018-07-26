package calcularComidaBuilder;

import calculadoracomida.Medida;

public class Comida {

	private final String nombre;
	private final int cantidadPorcion;
	private final Medida unidadDeMedida;
	private final int porciones;
	private final int calorias;
	private final int grasa;
	private final int sodio;
	private final int carbohidratos;
	
	public Comida(final String newNombre,final int newCantidadPorcion, final Medida newUnidadDeMedida, final int newPorciones,final int newCalorias,
			final int newGrasa, final int newSodio, final int newCarbohidratos) {
		super();
		this.nombre = newNombre;
		this.cantidadPorcion = newCantidadPorcion;
		this.unidadDeMedida = newUnidadDeMedida;
		this.porciones = newPorciones;
		this.calorias = newCalorias;
		this.grasa = newGrasa;
		this.sodio = newSodio;
		this.carbohidratos = newCarbohidratos;
	}

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}
	
	public static class ComidaBuilder{
		private String nestedNombre; 
	    private int nestedCantidadPorcion;
	    private Medida nestedUnidadDeMedida;
	    private int nestedPorciones;
	    private int nestedCalorias;
	    private int nestedGrasa;
	    private int nestedSodio;
	    private int nestedCarbohidratos;
	    
	    public ComidaBuilder(final String newNombre, final Medida newUnidadDeMedida) {
	    	this.nestedNombre = newNombre;
	    	this.nestedUnidadDeMedida = newUnidadDeMedida;
	    }
	    
	    public ComidaBuilder nombre(String newNombre) {
	    	this.nestedNombre = newNombre;
	    	return this;
	    }
	    
	    public ComidaBuilder porcion(int newCantidadPorcion) {
	    	this.nestedCantidadPorcion = newCantidadPorcion ;
	    	return this;
	    }
	    
	    public ComidaBuilder unidadMedida (Medida newUnidadMedida) {
	    	this.nestedUnidadDeMedida = newUnidadMedida;
	    	return this;
	    }
	    
	    public ComidaBuilder porciones(int newPorciones) {
	    	this.nestedPorciones = newPorciones ;
	    	return this;
	    }
	    
	    public ComidaBuilder calorias(int newCalorias) {
	    	this.nestedCalorias = newCalorias ;
	    	return this;
	    }
	    
	    public ComidaBuilder grasa (int newGrasa) {
	    	this.nestedGrasa = newGrasa;
	    	return this;
	    }
	    
	    public ComidaBuilder sodio(int newSodio) {
	    	this.nestedSodio = newSodio;
	    	return this;
	    }
	    
	    public ComidaBuilder carbohidratos (int newCarbohidratos) {
	    	this.nestedCarbohidratos = newCarbohidratos;
	    	return this;
	    }
	    
	    public Comida crearComida() {
	    	return new Comida(nestedNombre,nestedCantidadPorcion,nestedUnidadDeMedida,nestedPorciones,nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
	    }

		
	}
	
	

}
