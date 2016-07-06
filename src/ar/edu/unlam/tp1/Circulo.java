package ar.edu.unlam.tp1;

public class Circulo {

	private Double radio;
	private Double perimetro;
	private Double area;
	
	public Circulo(Double radioCirculo){
		
		this.radio = radioCirculo;
		this.perimetro = 0.0;
		this.area = 0.0;
	}
	
	public Double obtenerAreaDeUnCirculo(){
		
		this.area = Math.PI * this.radio * this.radio;
		return this.area;
	}
	
	public Double obtenerPerimetroDeUnCirculo(){
		
		this.perimetro = 2 * Math.PI * this.radio;
		return this.perimetro;
	}
	
	public Double obtenerRadioDeUnCirculo(){
		
		return this.radio;
	}
	
}
