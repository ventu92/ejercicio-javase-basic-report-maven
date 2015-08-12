package es.neodoo.model.vo;

public class TeacherVO {

	private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	private String apellidos;

	public TeacherVO(String nomnbre, String apellidos) {
		this.nombre = nomnbre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

}
