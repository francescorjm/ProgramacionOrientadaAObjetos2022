package Enumedaros;

public enum Dias_De_La_Semana {
	LUNES(true),
	MARTES(true),
	MIERCOLES(true),
	JUEVES(true),
	VIERNES(true),
	SABADO(false),
	DOMINGO(false);
	
	private boolean laborable;
	
	private Dias_De_La_Semana(boolean laborable) {
		this.laborable = laborable;
	}
	
	@Override
	public String toString() {
		
		if(laborable) {
			return "el dia "+ this.name().toLowerCase() +" es laborable";
		}else {
			return "el dia "+ this.name().toLowerCase() +" no es laborable";
		}
	}
}
