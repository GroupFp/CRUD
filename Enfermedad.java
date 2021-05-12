package lab2;

public class Enfermedad {
	String codigo;
	String nombre;
	String tipo;
	short tiempo;
	String medicacion;
	String notas;
	public Enfermedad() {}
	public Enfermedad(String codigo, String nombre, String tipo ) {
		this.codigo= codigo;
		this.nombre= nombre;
		this.tipo= tipo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public short getTiempo() {
		return tiempo;
	}
	public void setTiempo(short tiempo) {
		this.tiempo = tiempo;
	}
	public String getMedicacion() {
		return medicacion;
	}
	public void setMedicacion(String medicacion) {
		this.medicacion = medicacion;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	

}
