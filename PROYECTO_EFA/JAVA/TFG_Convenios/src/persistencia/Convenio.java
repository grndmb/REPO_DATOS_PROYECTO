package persistencia;
// Generated 18 abr. 2022 17:19:26 by Hibernate Tools 5.4.32.Final

/**
 * Convenio generated by hbm2java
 */
public class Convenio implements java.io.Serializable {

	private String idConvenio;
	private Empresa empresa;

	public Convenio() {
	}

	public Convenio(String idConvenio, Empresa empresa) {
		this.idConvenio = idConvenio;
		this.empresa = empresa;
	}

	public String getIdConvenio() {
		return this.idConvenio;
	}

	public void setIdConvenio(String idConvenio) {
		this.idConvenio = idConvenio;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
