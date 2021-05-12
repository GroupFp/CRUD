package lab2;
import java.util.*;
public class Paciente {
	String nombres;
	String paterno;
	String materno;
	String dni;
	boolean gnero;
	Date nacimiento;
	float peso;
	float talla;
	String codigo;
	Caso casospaciente;
	ArrayList<Caso> casosP=new ArrayList<>();
	
	public void adCase(Caso casopac) {
		casosP.add(casopac);
	}
	
	
	public ArrayList<Caso> getCasosP() {
		return casosP;
	}


	public void setCasosP(ArrayList<Caso> casosP) {
		this.casosP = casosP;
	}


	public Caso getCasospaciente() {
		return casospaciente;
	}
	public void setCasospaciente(Caso casospaciente) {
		this.casospaciente = casospaciente;
	}
	
	Paciente() {
		
	}
	public Paciente(String nombres, String paterno, String materno, String dni, Date nacimiento,float peso, float talla,String codigo){
		        this.nombres = nombres;
		        this.paterno = paterno;
		        this.materno = materno;
		        this.dni = dni;
		        this.nacimiento=nacimiento;
		        this.peso = peso;
		        this.talla = talla;
		        this.codigo = codigo;
		    }
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isGnero() {
		return gnero;
	}
	public void setGnero(boolean gnero) {
		this.gnero = gnero;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getTalla() {
		return talla;
	}
	public void setTalla(float talla) {
		this.talla = talla;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	

}
