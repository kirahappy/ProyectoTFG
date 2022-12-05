
package lieTime.model;

public class MentiraModel {

	private int id;

	private String nombre;

	private String textoMentira;

	private String complices; // Son los que saben la mentira aparte del usuario

	private String inocentes; // Son los que NO saben la mentira

	public MentiraModel(String nombre, String textoMentira, String complices, String inocentes) {
		this.nombre = nombre;
		this.textoMentira = textoMentira;
		this.complices = complices;
		this.inocentes = inocentes;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTextoMentira() {
		return textoMentira;
	}

	public void setTextoMentira(String textoMentira) {
		this.textoMentira = textoMentira;
	}

	public String getComplices() {
		return complices;
	}

	public void setComplices(String complices) {
		this.complices = complices;
	}

	public String getInocentes() {
		return inocentes;
	}

	public void setInocentes(String inocentes) {
		this.inocentes = inocentes;
	}

	@Override
	public String toString() {
		String resultado = "";
		resultado = " Nombre: " + nombre + "\nTexto:\n " + textoMentira + "Complices: \n" + complices + "Inocentes: \n"
				+ inocentes + " ";
		return resultado;
	}

}
