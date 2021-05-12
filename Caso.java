package lab2;

import java.util.*;
public class Caso {
	int numdc;
	
	String enfermedad;
	float temperatura;
	double saturacion;
	Date horafecha;
	String sintoma;
	String medicacion;
	public Caso() {}
	public Caso(String enfermedad, Date fecha, float temperatura) {
		this.enfermedad=enfermedad;
		this.horafecha=fecha;
		this.temperatura=temperatura;
	}
	
	
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public double getSaturacion() {
		return saturacion;
	}
	public void setSaturacion(double saturacion) {
		this.saturacion = saturacion;
	}
	public Date getHorafecha() {
		return horafecha;
	}
	public void setHorafecha(Date horafecha) {
		this.horafecha = horafecha;
	}
	public int getNumdc() {
		return numdc;
	}
	public void setNumdc(int numdc) {
		this.numdc = numdc;
	}
	
}
