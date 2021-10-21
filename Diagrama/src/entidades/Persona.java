package entidades;

public class Persona {
	protected long id;
	protected String nombre;
	protected char inicial;
	protected long edad;
	protected int numpremios;
	protected double estatura;
	protected boolean vip = false;

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getEdad() {
		return edad;
	}

	public void setEdad(long edad) {
		this.edad = edad;
	}

	public int getNumpremios() {
		return numpremios;
	}

	public void setNumpremios(int numpremios) {
		this.numpremios = numpremios;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public char getInicial() {
		return inicial;
	}

	public void setInicial(char inicial) {
		this.inicial = inicial;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", inicial=" + inicial + ", edad=" + edad + ", numpremios="
				+ numpremios + ", estatura=" + estatura + ", vip=" + vip + "]";
	}

}
