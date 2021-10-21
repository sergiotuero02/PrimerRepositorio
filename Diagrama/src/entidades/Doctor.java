package entidades;

public class Doctor extends Persona {

	protected String numcolegialo;
	protected String numdespacho;
	protected long idDoctor;

	public Doctor() {
		super();
		this.vip = true;
	}

	public String getNumcolegialo() {
		return numcolegialo;
	}

	public void setNumcolegialo(String numcolegialo) {
		this.numcolegialo = numcolegialo;
	}

	public String getNumdespacho() {
		return numdespacho;
	}

	public long getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(long idDoctor) {
		this.idDoctor = idDoctor;
	}

	public void setNumdespacho(String numdespacho) {
		this.numdespacho = numdespacho;
	}

	@Override
	public String toString() {
		return "Doctor [numcolegialo=" + this.numcolegialo + ", numdespacho=" + this.numdespacho + ", id=" + super.id
				+ ", nombre=" + this.nombre + ", edad=" + this.edad + ", numpremios=" + this.numpremios + ", vip=" + vip
				+ "]";
	}

}
