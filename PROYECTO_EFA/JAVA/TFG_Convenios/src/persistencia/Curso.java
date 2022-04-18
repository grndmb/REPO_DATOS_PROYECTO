package persistencia;
// Generated 18 abr. 2022 17:19:26 by Hibernate Tools 5.4.32.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso implements java.io.Serializable {

	private String nombreCurso;
	private String nombreAbrev;
	private int clave;
	private int horasFct;
	private boolean esPublico;
	private Set practicas = new HashSet(0);
	private Set alumnos = new HashSet(0);

	public Curso() {
	}

	public Curso(String nombreCurso, String nombreAbrev, int clave, int horasFct, boolean esPublico) {
		this.nombreCurso = nombreCurso;
		this.nombreAbrev = nombreAbrev;
		this.clave = clave;
		this.horasFct = horasFct;
		this.esPublico = esPublico;
	}

	public Curso(String nombreCurso, String nombreAbrev, int clave, int horasFct, boolean esPublico, Set practicas,
			Set alumnos) {
		this.nombreCurso = nombreCurso;
		this.nombreAbrev = nombreAbrev;
		this.clave = clave;
		this.horasFct = horasFct;
		this.esPublico = esPublico;
		this.practicas = practicas;
		this.alumnos = alumnos;
	}

	public String getNombreCurso() {
		return this.nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreAbrev() {
		return this.nombreAbrev;
	}

	public void setNombreAbrev(String nombreAbrev) {
		this.nombreAbrev = nombreAbrev;
	}

	public int getClave() {
		return this.clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public int getHorasFct() {
		return this.horasFct;
	}

	public void setHorasFct(int horasFct) {
		this.horasFct = horasFct;
	}

	public boolean isEsPublico() {
		return this.esPublico;
	}

	public void setEsPublico(boolean esPublico) {
		this.esPublico = esPublico;
	}

	public Set getPracticas() {
		return this.practicas;
	}

	public void setPracticas(Set practicas) {
		this.practicas = practicas;
	}

	public Set getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(Set alumnos) {
		this.alumnos = alumnos;
	}

}
