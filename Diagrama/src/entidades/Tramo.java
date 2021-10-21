package entidades;

public class Tramo {
	public long id;
	private int puntodeinicio;
	private int puntodefin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPuntodeinicio() {
		return puntodeinicio;
	}

	public void setPuntodeinicio(int puntodeinicio) {
		this.puntodeinicio = puntodeinicio;
	}

	public int getPuntodefin() {
		return puntodefin;
	}

	public void setPuntodefin(int puntodefin) {
		this.puntodefin = puntodefin;
	}

	@Override
	public String toString() {
		return "Tramo [id=" + id + ", puntodeinicio=" + puntodeinicio + ", puntodefin=" + puntodefin + "]";
	}

}
